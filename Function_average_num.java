import java.util.*;

public class Function_average_num {

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        float num=sc.nextFloat();
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the number:");
        float num1=sc1.nextFloat();
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the number:");
        float num2=sc2.nextFloat();

        float Average=AverageNumFunction(num, num1, num2);
        System.out.println("The Avearge of three numbers is:"+Average);
        

    }

    public static float AverageNumFunction(float num, float num1, float num2 )
    {
        float Average;
        Average=(num+num1+num2)/3;

        return Average;
    }
    

}
