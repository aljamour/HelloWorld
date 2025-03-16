package Uge7.ArrayList.øvelser.IKEAKatalog;

import java.util.*;

public class IKEAKatalog {
    private ArrayList<String> katalog;

    public IKEAKatalog() {
        katalog = new ArrayList<>(List.of(
                "KULLEN Kommode",
                "EKTORP Sofa",
                "EKEDALEN Spisebord",
                "KRYLBO Stol",
                "SLATTUM Seng"));
    }

    public void visKatalog() {
        System.out.println("MØBLER");
        System.out.println("====================\n");
        for (int i = 0; i < katalog.size(); i++) {
            System.out.println(katalog.get(i)); // printer lodret
//            System.out.println(katalog); // vil printe katalogets værdier vandret
        }
        System.out.println("\n====================\n");
    }

    public void tilføjMøbel(String tilføjetMøbel) {
        katalog.add(tilføjetMøbel);
    }

    public void visMenu() {
        System.out.println("Du har nu følgende muligheder:");
        System.out.println("0 - exit");
        System.out.println("1 - tilføj møbel til liste");
        System.out.println("2 - fjern møbel fra liste");
    }

    public void håndterBrugerValg() {
        Scanner scanner = new Scanner(System.in);
        String optionChoice = scanner.nextLine();

        if (optionChoice.equals("1")){

            System.out.println("\nHvad vil du gerne tilføje?");
            String nytMøbel = scanner.nextLine();
            tilføjMøbel(nytMøbel);
            System.out.println("\nMøblet blev tilføjet!\n");

            for(int i = 0; i < katalog.size(); i++) {
                System.out.println(katalog.get(i));
            }

            System.out.println("\nHer er listen sorteret i alfabetisk rækkefølge\n");
            Collections.sort(katalog);

            for (String møbel : katalog) {
                System.out.println(møbel);
            }


        } else if (optionChoice.equals("2")){

            System.out.println("\nHvad vil du gerne fjerne?");
            String removeMøbel = scanner.nextLine();
            fjernMøbel(removeMøbel);
            System.out.println("\nMøblet blev fjernet!\n");

            for(int i = 0; i < katalog.size(); i++) {
                System.out.println(katalog.get(i));

                System.out.println("Her er listen sorteret i alfabetisk rækkefølge");
                Collections.sort(katalog);
                System.out.println(katalog);
            }

        } else {
            System.out.println("Lukker programmet...");
            System.exit(0);
        }
    }

    public void fjernMøbel(String fjernetMøbel) {
        katalog.remove(fjernetMøbel);
    }
}
