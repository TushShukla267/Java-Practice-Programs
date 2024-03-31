import java.util.*;

public class Array_2D{

    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int r=sc.nextInt();
        Scanner sc1= new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int c=sc1.nextInt();
        System.out.println("The order of the entered matruix is:" + r + "x" + c);
        int matrix[][]=new int [r][c];
        int i;
        int j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();

                if(matrix[i][j]==2)
                 {
                    System.out.println("The entered number is 2 at index:" + i + "," + j);
                    continue;
                 }
            }
        }

        System.out.println("The matrix entered is:");

        for(i=0;i<r;i++)
        {
            System.out.println();

            for(j=0;j<c;j++)
            {
                 System.out.print(matrix[i][j]+ " ");
            }

        }

        }
}
