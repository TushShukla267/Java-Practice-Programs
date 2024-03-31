import java.util.*;

public class Arrays {

    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();

        int Numbers[]=new int [size];
        int i;
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the number in Array:");
            Numbers[i]=sc.nextInt();
            if(Numbers[i]==2)
            {
                System.out.println("Number 2 found on index:" + i);
            }
        }

        for(i=0;i<size;i++)
        {
            System.out.println(Numbers[i]);
        }
    }
    
}
