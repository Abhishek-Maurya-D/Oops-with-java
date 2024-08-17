interface MathOperation
{
    int operate(int a, int b);
}

public class add_fun {
    public static void main(String[] args) {
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(addition.operate(5, 2));
    }
}