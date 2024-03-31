import java.util.Scanner;

public class Function_RaiseTO {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number x :");
        int x=sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number n :");
        int n=sc1.nextInt();
       
        int x_n=CalPower(x ,n);
        System.out.println("X raise to n is:" + x_n);
       
        int n_x=CalPower1(x , n);
        System.out.println("N raise to x is:" + n_x);
    }
    
   
   
    public static int CalPower(int x , int n)
    {
        int temp=1;
        int i;
        for(i=1;i<=n;i++)
        {
            temp=temp*x;
        }
        return temp;
    }
   
   
    public static int CalPower1(int x , int n)
    {
        int temp1=1;
        int i;
        for(i=1;i<=x;i++)
        {
            temp1=temp1*n;
        }
        return temp1;
    }
}
