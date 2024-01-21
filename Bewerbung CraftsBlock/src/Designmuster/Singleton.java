package Designmuster;

//Das Singleton Designmuster gewährleistet, dass eine Klasse nur eine einzige
// Instanz hat und bietet einen globalen Zugriff darauf. Hier ist eine einfache
// Implementierung eines Singletons in Java:
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Privater Konstruktor, um die direkte Instanziierung zu verhindern
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Weitere Methoden und Eigenschaften der Singleton-Klasse
}
//In diesem Beispiel:
//
//    Der Konstruktor ist privat, um zu verhindern, dass die Klasse von außen instanziiert wird.
//    Die Instanz wird über die statische Methode getInstance abgerufen.
//    Die Methode ist synchronisiert, um sicherzustellen, dass die Instanz nur einmal erstellt
//    wird, insbesondere in einer multithreaded Umgebung.