import java.util.Scanner;

public class Main {

    private static final String USERNAME = "mikail";
    private static final String PASSWORD = "Mikail123!!";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptsLeft = MAX_ATTEMPTS;

        while (attemptsLeft > 0) {
            System.out.print("Bitte geben Sie ihren Benutzernamen ein: ");
            String enteredUsername = scanner.nextLine().trim();
            System.out.print("Bitte geben Sie ihr Passwort ein: ");
            String enteredPassword = scanner.nextLine().trim();

            if (authenticate(enteredUsername, enteredPassword)) {
                System.out.println("Glückwunsch!! Anmeldung ist erfolgreich!!");
                break;
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    System.out.println("Ihre Angaben sind falsch. Versuche verbleibend: " + attemptsLeft);
                } else {
                    System.out.println("Ihre Durchgänge sind ausgelaufen. Anmeldung ist gescheitert!");
                }
            }
        }
        scanner.close();
    }

    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
