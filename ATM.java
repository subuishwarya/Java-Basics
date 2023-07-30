import java.util.Scanner;
public class ATM
{
	public static void main(String[] args) {
		int Balance=30000;
		Scanner sc = new Scanner(System.in);  
	 {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform");
            System.out.print("\nenter your choice:");
            int choice=sc.nextInt();
             switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
        int withdraw = sc.nextInt();
        if(Balance>withdraw){ 
            Balance = Balance - withdraw;  
            System.out.println("collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        break;  
   
                case 2:  
        System.out.print("Enter money to be deposited:");  
        int deposit = sc.nextInt();  
        Balance = Balance + deposit;  
        System.out.println("Your Money has been successfully deposited");  
        break;  
                case 3:  
        System.out.println("Balance : "+Balance);  
        break;  
                case 4:  
       System.exit(0);  
            }  
        }  
    }  
	 
}
