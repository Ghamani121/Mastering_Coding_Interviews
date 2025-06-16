import java.util.Scanner;

public class exp1
{
    
    static Scanner sc=new Scanner(System.in);
    static int balance=10000;
    public static void main(String[] args) 
    {
        CheckLogin(3);
        sc.close();
        
    }
    public static void CheckLogin(int x)
    {
            if(x==0) return;
            
            System.out.println("enter the pin number");
            int num=sc.nextInt();

            if(num==1234)
            {
                System.out.println("login successful");
                Display();
            }
            else
            {
                System.out.println("login failed");
                System.out.println(x-1+" Attempts left ");
                CheckLogin(x-1);      
            }

    }
    public static void Display()
    {
            System.out.println("Enter the option");
            System.out.println("1.View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            int option=sc.nextInt();
            if(option==4) return;
            if(option==1)
            {
                ViewBalance();
            }
            if(option==2)
            {
                Deposit();
            }
            if(option==3)
            {
                Withdraw();
            }
            Display();
    }
    public static void ViewBalance()
    {
        System.out.println("Balance is "+balance);
        System.out.println();
    }
    public static void Deposit()
    {
        System.out.println("Enter the amount to deposit");
        float amount=sc.nextInt();
        balance=balance+(int)amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println();
    }
    public static void Withdraw()
    {
        System.out.println("Enter the amount to withdraw");
        float amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("Insufficient Balance");
            Withdraw();
            return;
        }
        balance=balance-(int)amount;
        System.out.println("Amount Withdrawn Successfully");
        System.out.println();
    }  
}