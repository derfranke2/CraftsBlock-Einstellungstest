package Designmuster;
public class Main {
    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        System.out.println(singletonInstance1 == singletonInstance2);  // Sollte true sein
    }
}
//    Ressourcenmanagement:
//        Wenn eine Ressource, wie z.B. eine Datenbankverbindung oder eine Netzwerkverbindung, nur einmal erstellt werden muss
//        und während der gesamten Lebensdauer des Programms verwendet wird.
//
//    Globale Konfigurationseinstellungen:
//        Wenn es global gültige Konfigurationseinstellungen gibt, die während der Ausführung des Programms konsistent
//        bleiben sollten.
//
//    Logging-Objekte:
//        Wenn ein einzelnes Logging-Objekt verwendet wird, um Protokolle aus dem gesamten Programm zu verwalten.
//
//    Cache-Implementierungen:
//        Bei der Implementierung eines Caches, um sicherzustellen, dass nur eine Instanz des Caches vorhanden ist.
//
//    Thread-Pools:
//        In Situationen, in denen ein globaler Thread-Pool erforderlich ist, um Aufgaben zu verarbeiten.