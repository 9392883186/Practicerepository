import java.util.Scanner;

class Variables
{
public static void main(String[] args)
{
int x;
float y;
float z=3.5F;
double result;
boolean check;

System.out.println("Enter one integer and floating value");

Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextFloat();
result=x+y+z;
System.out.println("result of three numbers after addition=" + result);

check=x>y;
System.out.println("The status is" +check);
}
}

