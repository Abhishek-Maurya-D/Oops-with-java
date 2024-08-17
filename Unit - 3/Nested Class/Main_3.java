class OuterClass {
    void outerMethod() {
        int localVar = 40; // Must be final or effectively final

        class LocalInnerClass {
            void display() {
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalInnerClass innerObj = new LocalInnerClass();
        innerObj.display();
    }
}

public class Main_3 {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.outerMethod();
    }
}
