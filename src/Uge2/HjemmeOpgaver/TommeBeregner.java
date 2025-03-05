package Uge2.HjemmeOpgaver;

import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        final double CM_PER_INCH = 3.8;

        Scanner scanner = new Scanner(System.in);

        //Der spyttes en tekst ud i konsollen
        System.out.println("Indtast længden i tommer: ");

        //Der scannes hvad jeg taster ind
        double tommer = scanner.nextDouble();

        // Laver beregning at tommer til centimeter. Det gør den ved at gange mit scannet til med difineret tal
        double centimeter = tommer * CM_PER_INCH;

        System.out.println(tommer + " tommer svarer til " + centimeter + " centimeter ");
        // Beregning for centimeter bliver printet ud
    }
}