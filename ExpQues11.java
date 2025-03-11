import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExpQues11 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);  // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
