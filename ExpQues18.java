import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExpQues18 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "root", "password");  // This will throw SQLException
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}
