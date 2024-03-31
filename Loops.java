import java.util.*;

public class Loops
{
    public static void main(String a[])
    {
        int i=0;
        Scanner sc0=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num0=sc0.nextInt();
        do
        {
            System.out.println("Hello world");
            i++;
        }while(i<=num0);
       

 

                                         //code to print sum of n numbers

        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the number upto which you want the sum");
        int num2=sc2.nextInt();
        int sum=0;
        for(i=1;i<=num2;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);



        Scanner sc3=new Scanner(System.in);
        int num3=sc3.nextInt();

                                         //code to print numbers from 0 to number entered 
                                    
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc1.nextInt();
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }



    }

}