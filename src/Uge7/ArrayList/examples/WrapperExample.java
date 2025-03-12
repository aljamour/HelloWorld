package Uge7.ArrayList.examples;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {

        // Autoboxing
        Integer i = 10;
        System.out.println(i);

        // Unboxing
        int a = i;

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(10);
        ints.add(20);
        ints.add(30);

        System.out.println(ints);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(32.0);

        for (int j = 0; j < 100; j++) {
            ints.add(i);
        }

        System.out.println(ints);

        String input = "32.0";

//        doubles.add(input); fejl, da ArrayList består af double og 'input' er en String. Derfor gør nedenstående:
        doubles.add(Double.parseDouble(input));

        System.out.println(doubles);
    }
}
