// NonNull.java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @NonNull annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface NonNull {
}

public class NonNullExample {

    public static void main(String[] args) {
        // This will work fine
        greet("John");

        // This will throw an IllegalArgumentException
        greet(null);
    }

    public static void greet(@NonNull String name) {
        if (name == null) {
            throw new IllegalArgumentException("Parameter 'name' cannot be null");
        }
        System.out.println("Hello, " + name + "!");
    }
}
