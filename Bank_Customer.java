import java.util.Scanner;

public class Bank_Customer {

    private static double accountBalance;

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Customer Name:");
        String name=sc.nextLine();

        Scanner sc1=new Scanner(System.in);
        System.out.print("Account Number:");
        int Acc_No=sc1.nextInt();

        accountBalance=0;

        int i=0;
        while(i<10)
        {
            System.out.println("1.Deposite");
            System.out.println("2.Widraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter Your Choice:");
            int ch=sc2.nextInt();
            
            switch(ch)
            {
                case 1:Deposite();
                       break;
                default:System.out.println("Invalid input");       
            }

            
        }
        System.out.println("We cannot assit you anymore have a graet day");
    }

    public static int Deposite()
    {
        Scanner sc3=new Scanner(System.in);
        System.out.print("Please Enter the Amount You Want to Deposite:");
        int Deposite=sc3.nextInt();

        System.out.println("You have Entered RS " + Deposite +" to be Deposited");
        accountBalance= accountBalance + Deposite;
        System.out.println("Your bank Balance is now updated to:" + accountBalance);
        return Deposite;
    }
    
}
