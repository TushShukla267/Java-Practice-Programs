import java.util.*;

public class Function_print_sum_num_odd_even {

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to find sum:");
        int num=sc.nextInt();


        int sum_odd=Function_print_sum_odd(num);
        System.out.println("The sum of odd numbers upto entered numbers is:"+sum_odd);

        int sum_even=Function_print_sum_even(num);
        System.out.print("The sum of the even numbers upto the entered numbers is:"+sum_even);

    }

    public static int Function_print_sum_odd(int num)
    {
        int sum=0;
        int i;
        for(i=0;i<=num;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }

        return sum;
    }
    
    public static int Function_print_sum_even(int num)
    {
        int sum=0;
        int i;
        for(i=0;i<=num;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }

        return sum;
    }
}
