package Uge3.Hjemmeopgaver;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et ord eller citat");
        String input = scanner.nextLine();
        isPalindrome(input);
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        String reversed = "";
        input = input.replace(" ", "");

        for (int i = input.length() - 1; i >= 0; i--)
            reversed += input.charAt(i);
        if (!input.equals(reversed)) {
            System.out.println("Teksten er ikke et palindrom!");
        } else {
            System.out.println("Teksten er et palindrom!");
        }
        return false;
    }
}