import java.util.Scanner;

public class Recursion2 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int n=sc.nextInt();
        int index=0;
        int Array[] = new int[n];

        int i;
        for(i=0;i<n;i++)
        {
            Array[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("The entered Array is:" + Array[i]);
        }

        System.out.println(Is_sorted(Array, index));
        
    }

    public static boolean Is_sorted(int Array[] , int index)
    {
        if(index == Array.length-1)
        {
            System.out.println("The Arrya is sorted in strictly incresing");
            return true;
        }
        if(Array[index] < Array[index+1])
        {
            return Is_sorted(Array, index+1);
        }
        else
        {
            System.out.println("The Array is not sorted in strictly incresing");
            return false;
        }
    }
    
}
