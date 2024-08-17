class OuterClass {
    private int outerVar = 30;

    class InnerClass {
        void display() {
            System.out.println("Outer variable: " + outerVar);
        }
    }
}

public class Main_2 {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
