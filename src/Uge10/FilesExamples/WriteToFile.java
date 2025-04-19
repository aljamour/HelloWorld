package Uge10.FilesExamples;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("La ilaha illAllah, Muhammadun Rasul Allah");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}