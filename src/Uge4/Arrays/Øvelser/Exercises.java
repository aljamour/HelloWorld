package Uge4.Arrays.Øvelser;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {

        //Find følgende syntaks for deklare et array af 10 heltal
        int[] a = new int[10];

        //øvelse 1.2
        int[] nummer = new int[10];
        System.out.println(nummer[0]);
        System.out.println(nummer.length - 1);

        // øvelse 1.3
        int[] number = {27, 51, 33, -1, 101};


        // Øvelse 1.4
        int[] number2 = new int[8];
        number2[1] = 4;
        number2[4] = 99;
        number2[7] = 2;

        int x = number2[1];
        number2[x] = 44;
        number2[number2[7]] = 11;

        // ØVELSE 2
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++){
            list[i] = list[i] + (list[i] / list[0]); // opdaterer værdien. Efter regnestykket med første indeks 2 + 2/2 = 3,
            // bliver
        }
        // 2.1 - {3, 24, 8, -5, 6, 1}

        // 2.2a
        double[] array = {4.5, 25.3, 12.1, 34.0, 15.5};
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.pow(array[i], 2);
        }
        System.out.println(Arrays.toString(array));

        // 2.2b
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.sqrt(array[i]);
        }
        System.out.println(Arrays.toString(array));

        // 2.2c
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 34.0) {
                System.out.println("Value found at index = " + i);
            }
        }

        // 2.2d
        double max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < max) {
                max = array[i];
                maxIndex = 1;
            }
        }
        System.out.println("Max er " + max + " fundet på index " + maxIndex);

        // 2.2e loop der finder minimum værdi
        double min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
                minIndex = 1;
            }
        }
        System.out.println("Min er " + min + " fundet på index " + minIndex);
    }
}