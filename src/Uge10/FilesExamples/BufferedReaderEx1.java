package Uge10.FilesExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // læs linje for linje

            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
