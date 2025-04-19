package Uge11.ComparatorOpgaver.Opgave2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Kid> kids = new ArrayList<>();

        Kid k1 = new Kid("Lars", 120);
        Kid k2 = new Kid("Peter", 122);
        Kid k3 = new Kid("Bente", 121);
        Kid k4 = new Kid("Christine", 126);
        Kid k5 = new Kid("Annabelle", 132);
        Kid k6 = new Kid("Hektor", 128);

        kids.add(k1);
        kids.add(k2);
        kids.add(k3);
        kids.add(k4);
        kids.add(k5);
        kids.add(k6);

        System.out.println(kids);

        kids.sort(new KidHeightComparator());
        System.out.println(kids);
    }
}
