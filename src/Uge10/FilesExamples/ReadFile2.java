package Uge10.FilesExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile2 {
    public static void main(String[] args){
        File file = new File("abi.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading file");
        }
    }
}
