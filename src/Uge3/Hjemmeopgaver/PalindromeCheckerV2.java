package Uge3.Hjemmeopgaver;

import java.util.Scanner;

public class PalindromeCheckerV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et ord eller citat:");
        String input = scanner.nextLine();

        // Kalder metoden og gemmer resultatet
        boolean result = isPalindrome(input);

        // Udskriver beskeden baseret på resultatet
        if (result) {
            System.out.println("Teksten er et palindrom!");
        } else {
            System.out.println("Teksten er ikke et palindrom!");
        }
    }

    public static boolean isPalindrome(String input) {
        input = input.toLowerCase().replace(" ", ""); // Fjerner mellemrum og gør småt
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed); // Returnerer true eller false
    }
}