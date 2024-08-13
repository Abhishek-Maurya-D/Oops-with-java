import java.util.Scanner;
public class SI{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Principle Amount: ");
          int P = sc.nextInt();
          System.out.print("Enter Rate of Interest: ");
          int R = sc.nextInt();
          System.out.print("Enter Time Period: ");
          int T = sc.nextInt();
          int si = (P*R*T)/100;
          System.out.println("Simple Interest is: " +si);
     }
}