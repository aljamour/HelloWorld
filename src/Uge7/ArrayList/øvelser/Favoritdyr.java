package Uge7.ArrayList.øvelser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Favoritdyr {
    public static void main(String[] args) {
        ArrayList<String> dyreListe = new ArrayList<>();

        dyreListe.add("Løve");
        dyreListe.add("Lemur");
        dyreListe.add("Ørn");

        System.out.println(dyreListe);

        dyreListe.add("Delfin");

        System.out.println(dyreListe);

        dyreListe.removeFirst();
        System.out.println(dyreListe);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et dyr");
        String input = scanner.nextLine();

        dyreListe.add(input);
        System.out.println(dyreListe);

        Collections.sort(dyreListe);
        System.out.println(dyreListe);
    }
}
