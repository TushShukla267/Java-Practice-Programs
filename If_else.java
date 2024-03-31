import java.util.*;


public class If_else
{

    public static void main(String[] args)
     {

        System.out.print("Enter your age:");
        
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();

        if(age>=18)
        {
 
            System.out.println("you are eligible to drive ");
        }
        else 
         {

            System.out.println("you are not eligible to drive");
        }

                                      //Code to find if number is odd or even 

        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter your number to check if odd or even:");
        int num=sc1.nextInt();

        if(num%2==0)
        {
            System.out.println("The Entered number is even");
        }
        else
        {
            System.out.println("The Entered number is odd ");

        }

                                    //code to find if a,b or c is greater 

        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the number A:");
        float a=sc2.nextFloat();
        Scanner sc3=new Scanner(System.in);
        System.out.print("Enter the number B:");
        float b=sc3.nextFloat();
        Scanner sc4=new Scanner(System.in);
        System.out.print("Enter the number C:");
        float c=sc4.nextFloat();

        if(a>b && a>c)
        {
            System.out.println("The greatest among the three is A ");
        }
        else if(b>a && b>c)
        {
            System.out.println("The greatest among the three is B ");
        }
        else 
        {
            System.out.println("The greatest among the three is C ");
        }

                                    //code to print greetings in different languages

        Scanner sc5=new Scanner(System.in);
        System.out.println("Enter the language in which you want your greeting");
        int button=sc5.nextInt();
        switch(button)
        {
            case 1:System.out.println("Hello");
            break;

            case 2:System.out.println("Namaste");
            break;

            case 3:System.out.println("Bonjour");
            break;

            default:System.out.println("Ivalid gretting");
            
            

        }
        
        
  
}
}


