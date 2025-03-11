import java.io.File;
import java.io.IOException;

public class ExpQues12 {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            file.createNewFile();  // Simulating IOException by using an invalid file path
            throw new IOException("This is an IOException.");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
