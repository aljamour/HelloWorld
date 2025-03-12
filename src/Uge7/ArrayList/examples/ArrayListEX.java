package Uge7.ArrayList.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEX {
    public static void main(String[] args){

        String[] bookArr = new String[3]; // et normalt array. Har den længde du definerer
        bookArr[0] = "De retskafne haver";
        bookArr[1] = "Majmoo'";
        bookArr[2] = "Adab al mufrad";

        System.out.println(Arrays.toString(bookArr));
        System.out.println(bookArr[1]);

        // Oprettelse af ArrayList
        // EKSEMPEL 1.1
        ArrayList<String> books = new ArrayList<>(); // arraylist er mere fleksible og har masser af plads. Det står lige nu uden værdier

        // Tilføjer værdier
        books.add("Sahih muslim");
        books.add("Sahih Bukhari");
        books.add("Sunan At-Tirmidhi");
        books.add("Ibn Majah");
        System.out.println(books); // med en arraylist behøver du heller ikke en Arrays.toString metode når man printer

        // tjekker om arraylisten er tom
        boolean isEmpty = books.isEmpty();
        System.out.println(isEmpty);

        // for at læse elementer fra et Arraylist, benytter man metoden get()
        String book = books.getFirst(); // kan også hedde .get('index')
        System.out.println(books);
        
        // fjerner element i ArrayList
        books.remove("Ibn Majah");
        System.out.println(books);
        
        // tjek om arraylisten indeholder det du skriver i parentes. printer true/false
        System.out.println(books.contains("Majmoo'"));

        // set kan placere en given værdi i listen
        books.set(0, "Safinat al Naja");
        
        // for loops
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.size());
        }

        // sletter alle elementer i ArrayList
        books.clear(); // sletter alt i den pågældende arrayList.

        // EKSEMPEL 1.2
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue")); // initialiserer med værdier
        colors.add("BLACK");
        colors.add("BLACK");
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++){
            if (colors.get(i).equalsIgnoreCase("BLACK")) {
                colors.remove(i);
            }
        }
        System.out.println(colors);

        
    }
}
