package Uge3.ConditionalsØvelser;

import java.util.Scanner;

public class TernaryExample2 {
    public static void main(String[] args) {
        // Correct Usernames and passwords
        final String CORRECT_ADMIN_USERNAME = "admin";
        final String CORRECT_ADMIN_PASSWORD = "1234";
        final String CORRECT_EMPLOYEE_USERNAME = "employee";
        final String CORRECT_EMPLOYEE_PASSWORD = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check login status using ternary operator
        String message = (username.equals(CORRECT_ADMIN_USERNAME) && password.equals(CORRECT_ADMIN_PASSWORD))
                ? "Hello admin"
                : (username.equals(CORRECT_EMPLOYEE_USERNAME) && password.equals(CORRECT_EMPLOYEE_PASSWORD))
                ? "Hello employee"
                : "Wrong credentials!";

        System.out.println(message);
    }
}