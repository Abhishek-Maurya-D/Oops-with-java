import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define the @Author annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Authors.class)
@interface Author {
    String name();
}

// Define the container annotation @Authors
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors {
    Author[] value();
}

@Author(name = "John Doe")
@Author(name = "Jane Smith")
@Author(name = "Alice Johnson")
public class MyClass {
    public static void main(String[] args) {
        // Access and print the authors using reflection
        Author[] authors = MyClass.class.getAnnotationsByType(Author.class);

        System.out.println("Authors of MyClass:");
        for (Author author : authors) {
            System.out.println(author.name());
        }
    }
}
