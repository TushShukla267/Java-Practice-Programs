import java.util.*;
public class Function_operating_numbers
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the number:");
        int b=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the Operator:");
        String Op=sc2.nextLine();

        int result=OperationsOfNumbers(a,b,Op);
        System.out.print("The result after operation of the numbers enterd is:"+result);
        
        
    }
    
    public static int OperationsOfNumbers(int a,int b,String Op)
    {
        int result;
        result=a + b;


        return result;




        /*if(Op=="+")
        {
            result=a + b;
        }
        else if(Op=="-")
        {
            result=a - b;
        }
        else if(Op=="*")
        {
            result=a * b;
        }
        else if(Op=="/")
        {
            result=a / b;
        }
        else 
        {
            result=a % b;
        }*/
       

        


    }
}
    