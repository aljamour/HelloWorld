package Uge7.ArrayList.øvelser;

import java.util.ArrayList;
import java.util.Arrays;

public class FillArrayList {
    public static void main(String[] args){
        ArrayList<Integer> tabel12 = new ArrayList<>(
        Arrays.asList(2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5));

        int søgeTal = 2;

        boolean fundet = false;
        for (int i = 0; i < tabel12.size(); i++) {
            if (tabel12.get(i) == søgeTal) {              // hvorfor kan den ik hedde contains?
                System.out.println("Fundet på index: " + i);
                fundet = true;
                break;
            }
        }
        if (søgeTal != 2) {
            System.out.println("Elementet blev ik fundet");
        }
    }
}
