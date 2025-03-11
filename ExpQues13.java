import java.lang.reflect.Field;

public class ExpQues13 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Field field = cls.getDeclaredField("nonExistingField");
        } catch (NoSuchFieldException e) {
            System.out.println("Caught NoSuchFieldException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
