package Uge3.Hjemmeopgaver;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et kodeord: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Kodeordet er sikkert!\uD83D\uDE00");
        } else {
            System.out.println("Kodeordet opfylder ikke sikkerhedskravene!");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        if (password.contains("secret") || password.contains("qwerty")) {
            return false;
        }

        if (!isAlphaNumeric(password)) {
            return false;
        }

        return true;
    }

    public static boolean isAlphaNumeric(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!isCharAlphaNumeric(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCharAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}