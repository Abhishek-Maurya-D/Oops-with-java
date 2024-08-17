class OuterClass {
    static int outerStaticVar = 10;
    // int outerInstanceVar = 20;

    static class StaticNestedClass {
        void display() {
            System.out.println("Outer static variable: " + outerStaticVar);
            // System.out.println("Outer instance variable: " + outerInstanceVar); // Error: Cannot access non-static variable
        }
    }
}

public class Main_1 {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
    }
}
