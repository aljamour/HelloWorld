package Uge4.Arrays.Øvelser;

import java.util.Arrays;

public class GuessTheOutput {
    // Øvelse 4.1
    public static void main(String[] args){
        int x = 1;
        int[] a = new int[3];
        mystery2(x);
        mystery1(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery1(int x, int[] a){
        x++;
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery2(int x){
        x += 1;
    }
}
