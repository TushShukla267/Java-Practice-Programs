import java.util.Scanner;

public class Fucnction_LCM_GCD {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1 = sc1.nextInt();

        Function_LCM(num, num1);

        Function_GCD(num, num1);
    }


    public static void Function_LCM(int num , int num1)
    {
        int i;
        for(i=1;i>0;i++)
        {
            if(num%i==0 && num1%i == 0)
            {
                System.out.println("The number which is LCM is:" + i);
            }
        }
    }


    public static void Function_GCD(int num , int num1)
    {
        int Product = num*num1;
        int i;
        for(i=2;i>0;i++)
        {
            if(num%i==0 && num1%i == 0)
            {
                int GCD=Product/i;
                System.out.println("This is the GCD of two numbers:" + GCD);
            }
        }
        
    }
    
}
