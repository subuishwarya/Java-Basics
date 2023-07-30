import java.util.Scanner;
public class main
{
     public static void main(String []args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a year:");
         int a=sc.nextInt();
         if(a%4==0)
         System.out.println("leap year");
         else
         System.out.println("not a leap year");
         }
}