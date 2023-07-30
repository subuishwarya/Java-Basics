package basic_lvl;
import java.util.Scanner;
public class fibanocci {
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a=sc.nextInt();
        int f=0;
        int g=1;
        for (int i=1;i<=a;i++)
        {
            System.out.println(f);
            f+=g;
            g=f-g;
        }
        sc.close();
    }
}
