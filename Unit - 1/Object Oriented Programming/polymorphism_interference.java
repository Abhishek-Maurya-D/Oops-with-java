// Polymorphism & Interface
interface Shape
{
	void print();
	void area();
}
class Circle implements Shape
{
	public void print()
	{
	}
	public void area()
	{
		System.out.println("Circle");
	}
}
class Rectangle implements Shape
{
	public void print()
	{
	}
	public void area()
	{
		System.out.println("Rectangle");
	}
}
class Triangle implements Shape
{
	public void print()
	{
	}
	public void area()
	{
		System.out.println("Triangle");
	}
}
//class Ellips extends Shape
//{
//}
public class polymorphism_interference
{
	public static void main(String[] args)
	{
		Shape s1, s2, s3;
		s1 = new Circle();
		s2 = new Rectangle();
		s3 = new Triangle();
		s1.area();
		s2.area();
		s3.area();
		// Shape s = new Shape();
	}
}