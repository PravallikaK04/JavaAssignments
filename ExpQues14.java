import java.lang.reflect.Method;

public class ExpQues14 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Method method = cls.getDeclaredMethod("nonExistingMethod");  // This will throw NoSuchMethodException
        } catch (NoSuchMethodException | ClassNotFoundException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }
    }
}
