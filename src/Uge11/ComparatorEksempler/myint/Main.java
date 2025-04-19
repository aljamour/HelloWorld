package Uge11.ComparatorEksempler.myint;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(2);
        ints.add(1);
        ints.add(9);

        System.out.println(ints);

        Collections.sort(ints);

        System.out.println(ints);

    }
}
