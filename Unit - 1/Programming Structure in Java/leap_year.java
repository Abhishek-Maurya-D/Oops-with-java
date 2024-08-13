import java.util.Scanner;
public class leap_year
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the year: ");
          int a = sc.nextInt();
          if((a%100==0 && a%400==0) || (a%100!=0 && a%4==0))
          {
               System.out.println("Leap Year");
          }
          else
          {
               System.out.println("Not a Leap Year");
          }
     }
}