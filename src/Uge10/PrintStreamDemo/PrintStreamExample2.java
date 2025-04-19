package Uge10.PrintStreamDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamExample2 {
    public static void main(String[] args) {
        File file = new File("files/text2.txt");
        PrintStream out = null;
        try {
            out = new PrintStream(file);
            out.println("HelloWorld");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
