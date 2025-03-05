package Uge3.MetoderØvelser;
import java.util.Scanner;

public class MetodeMedObjektExample {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Get user input using methods
        String name = getName(scanner);
        int age = getAge(scanner);

        // Print greeting using a method
        printGreeting(name, age);

        scanner.close();
    }
    // Create getName method
    public static String getName(Scanner sc) {
        System.out.println("Hvad er dit navn? ");
        return sc.nextLine();
    }

    // Create getAge method
    public static int getAge(Scanner sc) {
        System.out.println("Hvor gammel er du? ");
        while (!sc.hasNextInt()) { // Tjekker om input er et tal
            System.out.println("Ugyldigt input, indtast et tal for alder: ");
            sc.next(); // Rydder forkert input
        }
        return sc.nextInt();
    }

    // Create printGreeting method
    public static void printGreeting(String name, int age) {
        System.out.println("Hej " + name + "! Du er " + age + " år gammel.");
    }
}