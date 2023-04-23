package readingandwriting.exercises.exercise1readingfromafile;

public class TestReading {
    public static void main(String[] args) {
        // make sure the file with this name is on the root of the project
        // same level as src and target folder
        String file = "exercise1_filereader.txt";
        ReadFromFile.readFile(file);
    }
}
