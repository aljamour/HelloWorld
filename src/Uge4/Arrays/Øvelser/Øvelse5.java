package Uge4.Arrays.Øvelser;
import java.util.Arrays;
public class Øvelse5 {
    public static void main(String[] args) {
        // Øvelse 5.1 - Opret array
        int[] arr1 = {9, 5, 1, 8, 3, 2, 7, 4, 6};

        // 5.1a
        System.out.println(Arrays.toString(arr1));

        // 5.1b - sorter
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // 5.1c - opret nyt array. Benyt metode til tjekke om de indeholder samme værdier
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.equals(arr1, arr2));

        // 5.2
        // a) a = {0, 2, 3, 4, 5, 6, 7, 0} // a.length - 1 er det sidste element fordi længden er 8, og det nul indeks baseret så det 7. indeks er tallet 8, som bliver til 0
        // b) b = {0, 2, 3, 4, 5, 6, 7, 0} // og det 0. indeks er sat til 0.
        // c) c = {1, 2, 3, 4, 5, 6, 7, 8} // separat kopi, så ændrer sig ikke
        // d) d = {1, 2, 3, 4, 5, 6, 7, 8} // separat kopi, så ændrer sig ikke

    }
}