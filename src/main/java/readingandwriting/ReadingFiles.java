package readingandwriting;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("file.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getClass());
            System.out.println("An I/O error occurred!");
        }

    }
}
