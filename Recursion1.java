import java.util.Scanner;

public class Recursion1 {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = sc.nextLine();
        int index = name.length()-1;

        Print_rev_name(name, index);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the String with repeated cahracter:");
        String str = sc1.nextLine();
        int index1 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the character you want to find First and Last occurance of:");
        char str1 = sc2.next();
        
        Find_Occurance(str , str1 ,index1);



    }


    public static void Print_rev_name(String name , int index)
    {
        if(index == 0)
        {
            System.out.print(name.charAt(index));
            return;
        }
        System.out.print(name.charAt(index));

        Print_rev_name(name, index-1);
    }


    public static int First=-1;
    public static int Last=-1;
    public static void Find_Occurance(String str , char str1 , int index1)
    {
        if(index1 ==0)
        {
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char CurrChar = str.charAt(index1);
        if(CurrChar == str1)
        {
            if(First == -1)
            {
                First=index1;
            }
            else
            {
                Last=index1;
            }
        }
        Find_Occurance(str, str1, index1+1);
    }
}
