import java.util.Scanner;

public class Sorting {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the Array:");
        int num=sc.nextInt();

        int Array[]= new int [num];

        int i;
        int j;
                                           //inputting array
        for(i=0;i<num;i++)
        {
            System.out.print("Enter the elements of Array:");
             Array[i]=sc.nextInt();
        } 
                             
                                           //Printing array    
                                           
        System.out.println("This is the original array entered by you:");                                   
        for(i=0;i<num;i++)
        {
            System.out.print(Array[i] + " ");
        }

                                 //sorting of array in Accending order by bublle sort                          
        for(i=0;i<Array.length-1;i++)
        {
            for(j=0;j<Array.length-i-1;j++)
            {
               if(Array[i]>Array[i+1]) 
               {
                //swap
                int temp=Array[i];

                Array[i]=Array[i+1];

                Array[i+1]=temp;

               }
             
            }
        }
        System.out.println();
        System.out.println("This is the array in the Accending order:");
        for(i=0;i<Array.length;i++)
        {
            System.out.print(Array[i] + " ");
        }


                                           //Sorting of array in decending order by bubble sort 






                                         // sorting of array by selection sort

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the lenght of the Array:");
        int num1=sc1.nextInt();

        int Array1[]= new int [num1];

        
                                           //inputting array
        for(i=0;i<num1;i++)
        {
            System.out.print("Enter the elements of Array:");
             Array1[i]=sc.nextInt();
        } 
                             
                                           //Printing array    
                                           
        System.out.println("This is the original array entered by you:");                                   
        for(i=0;i<num1;i++)
        {
            System.out.print(Array1[i] + " ");  
        }


                                         //sorting of array in accending order by seletion sort 
   
                                         
             for(i=0;i<Array1.length-1;i++)
             {
                int smallest=Array1[i];
                for(j=i+1;j<Array1.length;j++)
                {
                    if(Array1[smallest]>Array1[j])
                    {
                        smallest=j;
                    }
                }

                int temp=Array1[smallest];

                Array1[smallest]=Array1[i];

                Array1[i]=temp;
             }

        System.out.println();
        System.out.println("This is the array in the Accending order:");
        for(i=0;i<Array1.length;i++)
        {
            System.out.print(Array1[i] + " ");
        }


}    
}