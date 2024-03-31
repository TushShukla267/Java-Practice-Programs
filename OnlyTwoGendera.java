import java.util.*;

public class OnlyTwoGendera {

    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your gender:");
        String gen=sc.nextLine();

        if(gen.equals("male"))
        {
            System.out.println("You are a man");
        }
        else if(gen.equals("female"))
        {
            System.out.println("you are a woman");
        }
        else
        {
            System.out.println("you are a invalid homo sapien so get the fuck outta here");
        }
        
    }
    
}
