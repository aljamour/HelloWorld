package Uge7.ArrayList.øvelser;

import java.util.ArrayList;
import java.util.Scanner;

public class GætHemmeligtOrd {
    public static void main(String[] args) {
        ArrayList<String> hemmeligeOrd = new ArrayList<>();

        hemmeligeOrd.add("syntaks");
        hemmeligeOrd.add("bedetæppe");
        hemmeligeOrd.add("toiletpapir");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gæt et ord");

        while (true) {
            String gæt = scanner.nextLine().toLowerCase();

            if (gæt.contains("syntaks") || gæt.contains("bedetæppe") || gæt.contains("toiletpapir")){
                System.out.println("Du gættede rigtigt min bror!");
                break;
            } else {
                System.out.println("Argh, ikke helt min ven...");
                System.out.println("Prøv igen:");
            }
        }
    }
}
