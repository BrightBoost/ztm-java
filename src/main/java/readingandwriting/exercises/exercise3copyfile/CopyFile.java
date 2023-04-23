package readingandwriting.exercises.exercise3copyfile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CopyFile {
    public static void copyFile(String sourcePath, String destinationPath) throws FileNotFoundException {
        try (FileReader reader = new FileReader(sourcePath);
             FileWriter writer = new FileWriter(destinationPath)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        }
    }
}

