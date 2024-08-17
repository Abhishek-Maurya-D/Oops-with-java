import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class List_lambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Abhishek", 21),
            new Person("Ankur", 19),
            new Person("Charlie", 35)
        );
        
        // Using a lambda expression to sort by name
        people.sort((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

        // Print sorted list
        for (Person person : people) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}
