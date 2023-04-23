package readingandwriting.exercises.exercise2writingtoafile;

public class TestWriting {
    public static void main(String[] args) {
        String filename = "exercise2_filewriter.txt";
        String[] names = {"Walnut", "Snowflake", "Muffin"};
        WriteToFile.writeNames(filename, names);
    }
}
