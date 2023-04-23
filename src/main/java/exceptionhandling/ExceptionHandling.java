package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("sample.txt")) {

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO problem");
        }
        System.out.println("Done!");
    }
}
