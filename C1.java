import java.util.Scanner;
class C1{
public static int power(int x,int y)
{int sum = 1;for (int i = 0; i < y; i++) 
{sum *= x;
}
return sum;
}
public static int factorial(int n){
int result =1;
for(int i =2;i<=n;i++){
result = i;
}
return result;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter N: ");
int n = sc.nextInt();
System.out.print("Enter X: ");
int x = sc.nextInt();
double result = 1.0;
int sign = -1;
int power = 2;
for (int i = 0; i < n; i++){
sign *=-1;
double term =power(x,power)/factorial(power);
result +=sign*term;
power +=2;
}
System.out.println("cos("+x+")="+result);
}
}