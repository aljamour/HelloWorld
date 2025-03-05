package Uge2.ØvelserITimen;

public class Loops {
    public static void main(String[] args) {
        // Opgave 1

        for (int i = 0; i <= 3; i++)
            System.out.println("Hello World: " + i);
        System.out.println("\n" + "Opgave 2");

        // Opgave 2
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        // Opgave 3
        for (int k = 1; k <= 10; k++) {
            System.out.println("e: " + k);
        }

        // Opgave 4
        for (int l = 5; l >= -5; l--) {
            System.out.println(l);
        }

        // Opgave 5
        for (int m = 5; m <= 30; m = m + 3) {
            System.out.println(m);
        }

        // Opgave 6
        // a) "Er der en fejl i koden?" svar: ja, der mangler: count++;
        // fordi lige nu stopper det loop ikke førend man selv stopper den.

        // Opgave 7
        int count = 0;
        int sum = 0;

        do {
            System.out.println("Current count is " + count);
            System.out.println("Current sum is " + sum);
            sum += count;
            count++;
        } while(count > 0 && count < 10);
    }
}
