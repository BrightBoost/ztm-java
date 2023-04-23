package readingandwriting.exercises.exercise3copyfile;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "exercise3_input.txt";
        String destinationPath = "exercise3_output.txt";

        try {
            CopyFile.copyFile(sourcePath, destinationPath);
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

}
