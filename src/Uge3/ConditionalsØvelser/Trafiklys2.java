package Uge3.ConditionalsØvelser;

import java.util.Scanner;
public class Trafiklys2 {
    public static void main(String[] args){
        // Bed brugeren om at skrive en farve
        System.out.println("Indtast en farve (rød, gul, grøn): "); //Sørg for input er i små bogstaver

        Scanner scanner = new Scanner(System.in);
        String farve = scanner.nextLine().toLowerCase();

        switch (farve){
            case "rød":
                System.out.println("Stop");
                break;
            case "gul":
                System.out.println("vent");
                break;
            case "grøn":
                System.out.println("gå");
                break;
            default:
                System.out.println("brug venligst rød, gul eller grøn");
        }

        String safe = (farve.equals("gå")) ? "Det er sikkert at krydse vejen" : "Det er ikke sikker at krydse vejen";
        System.out.println(safe);
    }
}
