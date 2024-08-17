interface Mathoperations {
    static double squareRoot(int num) {
        return Math.sqrt(num);
    }
}

class MathoperationsImp implements Mathoperations {
    // No changes needed here
}

public class static_demo {
    public static void main(String[] args) {
        // Fix: Use the interface name to call the static method and store the result in a double variable
        double x = Mathoperations.squareRoot(15);
        System.out.println(x);
    }
}
