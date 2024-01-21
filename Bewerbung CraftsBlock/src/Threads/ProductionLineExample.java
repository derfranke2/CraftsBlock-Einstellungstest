import java.util.concurrent.*;

class Product {
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ProductionLine {
    private BlockingQueue<Product> queue1 = new LinkedBlockingQueue<>();
    private BlockingQueue<Product> queue2 = new LinkedBlockingQueue<>();

    public void startProduction() {
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Product product = new Product("Product-" + i);
                    System.out.println("Produziert: " + product.getName());
                    queue1.put(product);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread workerThread1 = new Thread(() -> {
            try {
                while (true) {
                    Product product = queue1.take();
                    System.out.println("Station 1: Verarbeitet " + product.getName());
                    queue2.put(product);
                    TimeUnit.SECONDS.sleep(2);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread workerThread2 = new Thread(() -> {
            try {
                while (true) {
                    Product product = queue2.take();
                    System.out.println("Station 2: Verarbeitet " + product.getName());
                    // Hier könnten weitere Verarbeitungsschritte erfolgen
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Produkt fertiggestellt: " + product.getName());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        workerThread1.start();
        workerThread2.start();

        try {
            producerThread.join();
            workerThread1.join();
            workerThread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProductionLineExample {
    public static void main(String[] args) {
        ProductionLine productionLine = new ProductionLine();
        productionLine.startProduction();
    }
}
