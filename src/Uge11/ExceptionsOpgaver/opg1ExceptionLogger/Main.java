package Uge11.ExceptionsOpgaver.opg1ExceptionLogger;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast et heltal");
        int a = scan.nextInt();
        scan.nextLine();

        System.out.println("Indtast endnu et heltal");
        int b = scan.nextInt();
        scan.nextLine();

        try {
            double resultat = division(a, b);
            System.out.println("Resultatet bliver: " + resultat);

        } catch (DivisionByZeroException de) {
            System.out.println("Fejl! Ikke muligt at dividere med 0");
        }

    }

    public static double division (int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroException("Du er helt væk");
        }
        return (double) num1 / num2;
    }
}

