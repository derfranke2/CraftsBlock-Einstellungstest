public class FibonacciSum {

    public static void main(String[] args) {
        int n = 10; // Ändere dies entsprechend der gewünschten Position
        long sum = fibonacciSum(n);
        System.out.println("Summe der Fibonacci-Zahlen bis zur Position " + n + ": " + sum);
    }

    public static long fibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return fibonacci(n, 0, 1, 0);
        }
    }

    private static long fibonacci(int n, long a, long b, long sum) {
        if (n == 1) {
            return sum + 1;
        } else {
            return fibonacci(n - 1, b, a + b, sum + a);
        }
    }
}
