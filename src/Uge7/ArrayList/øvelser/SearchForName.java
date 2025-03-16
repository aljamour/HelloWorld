package Uge7.ArrayList.øvelser;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchForName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        names.add("Aden");
        names.add("Mo");
        names.add("Junes");

        System.out.println("Skriv et navn");
        String nytNavn = scanner.nextLine().toLowerCase();

        if (!names.contains(nytNavn)) {
            System.out.println("Navnet findes ikke i listen. Vil du tilføje det? ja/nej");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equalsIgnoreCase("ja")) {
                names.add(answer);
                System.out.println("Navnet blev tilføjet til listen");
            } else {
                System.out.println("Okay :D");
                System.exit(0);
            }

        } else {
            System.out.println("Det findes allerede");
        }

    }
}
