package Uge2.ØvelserITimen;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast brugernavn: ");
        String userNavn = scanner.nextLine();

        System.out.println("Indtast yndlingsfarve: ");
        String userFarve = scanner.nextLine();

        System.out.println("Dit navn er: " + userNavn + "\nog din yndlingsfarve er: " + userFarve);
    }
}
