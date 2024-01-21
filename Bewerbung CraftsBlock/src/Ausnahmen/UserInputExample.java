import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class UserInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie eine positive Zahl ein: ");
            int userInput = scanner.nextInt();
            validateInput(userInput);
            System.out.println("Die eingegebene Zahl ist: " + userInput);
        } catch (NegativeNumberException e) {
            System.out.println("Fehler: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ungültige Eingabe. Bitte geben Sie eine ganze Zahl ein.");
        } finally {
            scanner.close();
        }
    }

    private static void validateInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative Zahlen sind nicht erlaubt.");
        }
    }
}
