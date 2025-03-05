package Uge4.Arrays.Eksempler;
import java.util.Arrays;

public class ArrayBasics2 {
    public static void main(String[] args) {

        // Arrays.toString - printer værdierne ud i et array

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numbers));

        // Arrays.sort - sorterer værdierne i et array fra mindst-størst

        int[] numbers2 = {5, 9, 3, 4, 8, 1};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // eks hvor parameteren er double

        double[] numbers3 = {8.4, 11.6, 2.3, 4.9, 5.7};
        Arrays.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));

        // Array.equals - tjekker om værdierne i to arrays er de samme

        int[] a = {3, 2, 1};
        int[] b = {3, 2, 1};
        System.out.println(Arrays.equals(a, b));

        // eks. hvor værdier ikke er de samme

        int[] c = {3, 9, 2};
        int[] d = {3, 2, 9};
        System.out.println(Arrays.equals(c, d));

        // Arrays.fill() - fylder et array med én værdi

        int[] numbers4 = new int[5];        // laver et array med 5 pladser
        Arrays.fill(numbers4, 7);       // alle pladser får den bestemte værdi
        System.out.println(Arrays.toString(numbers4));

        // Arrays.copyOf() - kopiering af arrays.

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);    // opretter ny kopi af et array med en bestemt længde; her 5.
        System.out.println(Arrays.toString(copy));            // 2 pladser tilføjes med værdien 0

        // (navn-på-array).clone(); - er en metode, der opretter en overfladisk kopi af arrayet. Den laver en kopi af arrayets
        // struktur, men elementerne i arrayet (hvis det er objekter) vil stadig referere til de samme objekter i hukommelsen.

        int[] arr = {1, 2, 3};
        int[] arrCopy = arr.clone();

        arrCopy[0] = 99;
        System.out.println(arr[0]);         // printer første element i arrayet "arr" som er 1.
        System.out.println(arrCopy[0]);     // printer første element i det klonede array, men ovenover er det defineret til 99
    }
}
