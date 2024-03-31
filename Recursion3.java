import java.util.Scanner;

public class Recursion3 {

    public static void main(String args[])
    {
        //Code to add the x that is entered in the middle of the string to the end 

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        int index=0;
        int count=0;
        String New_str="";

        X_TO_END(str, index, count, New_str);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the string with duplicate characters:");
        String str1=sc1.nextLine();
        int index1=0;
    }
    public static void X_TO_END(String str ,int index ,int count , String New_str)
    {
        if(index == str.length())
        {
            int i;
            for(i=1;i<=count;i++)
            {
                New_str = New_str + 'x';
            }
            System.out.println(New_str);
            return;
        }
        char Current_char=str.charAt(index);
        if(Current_char =='x')
        {
            count++;
            X_TO_END(str, index+1, count, New_str);
        }
        else
        {
            New_str = New_str + Current_char;
            X_TO_END(str, index+1, count, New_str);
        }
    }


    public static void Remove_duplicate(String str1 , int index1 ,)
    
}
