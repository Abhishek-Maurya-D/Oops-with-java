// program for hierarchical interitance

// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Create an instance of Dog-
        Dog dog = new Dog();
        dog.eat();  // Method from parent class
        dog.bark(); // Method from Dog class
        
        // Create an instance of Cat
        Cat cat = new Cat();
        cat.eat();  // Method from parent class
        cat.meow(); // Method from Cat class
    }
}