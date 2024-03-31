import java.util.*;

public class Function_and_Methods {

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();

        System.out.print("Your entered name is:");
        printMyName(name);
    }

    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    
    
}
