import java.util.*;  
class hw
{  
public static void main(String args[])
{  
Scanner n1 = new Scanner(System.in);  
System.out.print("Enter Number 1 : ");
int num1 = n1.nextInt();  
int num_len = Integer.toString(num1).length();
int len = 5;
int zeros = len - num_len;
System.out.print("Num1 is: ");
while(zeros-- > 0)
{
    System.out.print("0");
}
System.out.println(num1);
Scanner n2 = new Scanner(System.in);  
System.out.print("\nEnter Number 2 : ");  
int num2 = n2.nextInt();  
System.out.print("Num2 is: " + num2);             
n1.close();
}  
}  