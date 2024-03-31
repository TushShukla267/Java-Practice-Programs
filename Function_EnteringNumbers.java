import java.util.Scanner;

public class Function_EnteringNumbers {

    public static void main(String arg[])
    {
        System.out.println("Enter the numbers you want to check and when done type End:");

        Enter_numbers();
    }


    public static void Enter_numbers()
    {
        Scanner sc =new Scanner(System.in);
        int i;
        for(i=1;i>0;i++)
        {
            int num=sc.nextInt();
        }
    }
    
}
