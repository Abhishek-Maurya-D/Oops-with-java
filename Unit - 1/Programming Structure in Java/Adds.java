import java.util.Scanner;

public class Adds {
    public int x;
    public int y;

    public void Sum() {
        int z = x + y;
        System.out.println("The sum is: " + z);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Adds add = new Adds();

        System.out.print("Enter the first number: ");
        add.x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        add.y = scanner.nextInt();

        add.Sum();
        scanner.close();
    }
}
