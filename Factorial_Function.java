import java.util.*;

public class Factorial_Function{

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which you want factorial of:");
        int num=sc.nextInt();

        int factorial=FactorialFunction(num);

        System.out.print("The factorial of the given number is:"+factorial);
    }

    public static int FactorialFunction(int num)
    {
        int i;
        int factorial=1;
        for(i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }

        return factorial;
    }

}
