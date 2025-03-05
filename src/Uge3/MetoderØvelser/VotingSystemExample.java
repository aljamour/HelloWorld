package Uge3.MetoderØvelser;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VotingSystemExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast din alder:");
        int age = getInput(scanner, "Du skal indtaste en numerisk værdi");
        boolean canVote = isEligibleForVoting(age);

        if (canVote) {
            showMenu(scanner);
        }
    }

    public static int getInput(Scanner scanner, String errorMessage){
        while (!scanner.hasNextInt()){
            System.out.println(errorMessage);
            scanner.nextLine();
        }

        scanner.hasNextInt();
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }
    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Vælg en kandidat");
            System.out.println("1: John Doe");
            System.out.println("2: Jane Love");

//            int choice = scanner.nextInt();
            int choice = getInput(scanner, "Du skal indtaste et tal");

            switch (choice) {
                case 1 -> {
                    System.out.println("Du har stemt på John Doe");
                    return;
                }
                case 2 -> {
                    System.out.println("Du har stemt på Jane Love");
                    return;
                }
                default -> System.out.println("Ugyldigt valg");
            }
        }
    }
    public static boolean isEligibleForVoting (int age) {
        if (age < 18){
            System.out.println("Du er ikke gammel nok til at stemme!");
            return false;
        }
        return true;
    }
}

