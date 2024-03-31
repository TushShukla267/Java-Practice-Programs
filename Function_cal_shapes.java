import java.util.*;

public class Function_cal_shapes {

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value pof the radius of the circle:");
        Double r=sc.nextDouble();

        Double circumference=Function_cal_circumference( r );  
        System.out.println("The circumference of the circle is:"+circumference); 
        
        Double area=Function_cal_area( r );
        System.out.println("The area of the circle is:"+area);

        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        Double l=sc2.nextDouble();
        Scanner sc3=new Scanner(System.in);
        System.out.print("Enter the breadth of the rectangle:");
        Double b=sc3.nextDouble();

        Double area_rect=Function_cal_area_rectangle( l , b );
        System.out.println("The area of the rectangle is:" + area_rect );
        

    }

    public static Double Function_cal_circumference(Double r)
    {
        Double c= 2 * 3.14 * r;

        return c;
    }

    public static Double Function_cal_area(Double r)
    {
        Double a=3.14 * r * r;

        return a;
    }

    public static Double Function_cal_area_rectangle(Double l , Double b)
    {
        Double a= l * b;

        return a;
    }
    
}
