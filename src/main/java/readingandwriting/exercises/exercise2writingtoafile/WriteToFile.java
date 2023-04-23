package readingandwriting.exercises.exercise2writingtoafile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeNames(String filePath, String[] names) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

