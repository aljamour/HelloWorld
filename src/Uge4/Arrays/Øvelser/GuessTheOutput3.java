package Uge4.Arrays.Øvelser;

import java.util.Arrays;

public class GuessTheOutput3 {
    // Øvelse 4.3
    public static void main(String[] args){
        int x = 1;
        int[] a = new int[2];
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
        x--;
        a[1] = a.length;
        mystery(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void mystery(int x, int[] list){
        list[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(list));
    }
}
