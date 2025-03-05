package Uge2.LinkedIn;
import java.util.Scanner;
public class FortuneTellerExample {
    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in); // Hvad gør "new"?

        int inputtedNum = scanner.nextInt();
        //"scanner.nextInt()" ser på den næste integer, altså den enkelte talværdi som brugeren skriver ind

        if (inputtedNum < 5){
            System.out.println("Køerne vil græsse på marken");

        } else {
            System.out.println("Det bliver koldt i dag");
        }
    }
}
