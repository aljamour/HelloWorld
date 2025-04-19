package Uge10.FilesExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferedReader2 {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String str = null;

            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
