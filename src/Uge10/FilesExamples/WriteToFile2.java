package Uge10.FilesExamples;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteToFile2 {
    public static void main(String[] args){
        try {
            PrintStream out = new PrintStream("text2.txt");
            out.println("Output 1");
            out.println("Output 2");
            out.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
