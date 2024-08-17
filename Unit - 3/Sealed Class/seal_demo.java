// Sealed abstract class Shape permits only Circle and Rectangle to extend it
public sealed abstract class Shape permits Circle, Rectangle {
    abstract double area(double x, double y);
    abstract void print(double a);
}

// Circle class is a final class extending Shape
final class Circle extends Shape {
    @Override
    public double area(double x, double y) {
        return x * y * y;
    }

    @Override
    public void print(double a) {
        System.out.println("Area of the circle is: " + a);
    }
}

// Rectangle class is a final class extending Shape
final class Rectangle extends Shape {
    @Override
    public double area(double x, double y) {
        return x * y;
    }

    @Override
    public void print(double a) {
        System.out.println("Area of the rectangle is: " + a);
    }
}

public class seal_demo {
    public static void main(String[] args) {
        // Circle
        Shape cir = new Circle();
        double v1 = cir.area(3.14, 7);
        cir.print(v1);

        // Rectangle
        Shape rec = new Rectangle();
        double v2 = rec.area(4, 5);
        rec.print(v2);
    }
}
