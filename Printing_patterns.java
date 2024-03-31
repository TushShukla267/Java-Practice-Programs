import java.util.*;

public class Printing_patterns {

    public static void main(String a[])
    {
        int i;
        int j;

                                                    //code to print rectangle 2
                                            
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle:");
        int row=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle:");
        int col=sc2.nextInt();
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

                                          //code to print a Hallow rectangle

        /*Scanner sc3=new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle:");
        int r=sc3.nextInt();
        Scanner sc4=new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle:");
        int c=sc4.nextInt();
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(i==1 || i==r ||j==1 ||j==c) 
                {
                    System.out.print("*");
                }
                else
                {
                     System.out.print("");
                }
            }
            System.out.println();
        }*/

                                                   //code to print half pyramid 

        Scanner sc0=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc0.nextInt();
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print("*");
           }
           System.out.println();
        }

                                             //code to print inverved half pyramid 

        Scanner sc5=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n1=sc5.nextInt();
        for(i=n1;i>=1;i--)
        {
           for(j=i;j>=1;j--)
           {
            System.out.print("*");
           }
           System.out.println();
        }

                                            //code to print half pyramid after 180 degree rotation

       /*  Scanner sc6=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n2=sc6.nextInt();
        for(i=1;i<=n2;i++)
        {
           for(j=1;j<=i;j++)
           {
            if(j<=n2-i)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("*");
            }
           }
           System.out.println();
        }*/


 
                                         //code to print pyramid of numbers

        Scanner sc8=new Scanner(System.in);
        System.out.print("Enter the number:");
         int n4=sc8.nextInt();
        for(i=1;i<=n4;i++)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print(i);
           }
           System.out.println();
        }

                                           //code to print inverted pyramid of numbers

        Scanner sc7=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n3=sc7.nextInt();
        for(i=n3;i>=1;i--)
        {
           for(j=i;j>=1;j--)
           {
            System.out.print(i);
           }
           System.out.println();
        }

                                    //code to print pyramid of different numbers 


        Scanner sc9=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n5=sc9.nextInt();
        for(i=1;i<=n5;i++)
        {
           for(j=1;j<=i;j++)
           {
            System.out.print(j);
           }
           System.out.println();
        }




                                          //code to print inverted pyramid of numbers

        Scanner sc10=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n6=sc10.nextInt();
        for(i=n6;i>=1;i--)
        {
           for(j=i;j>=1;j--)
           {
            System.out.print(j);
           }
           System.out.println();
        }
}


}