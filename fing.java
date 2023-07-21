import java.util.*;
class fing
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n%8;
		if(m==1)
		{
			System.out.print("Thumb");
		}
		if(m==2||m==0)
		{
			System.out.print("index");
		}
		if(m==3||m==7)
		{
			System.out.print("Middle");
		}
		if(m==4||m==6)
		{
			System.out.print("Ring");
		}
		if(m==5)
		{
			System.out.print("Little");
		}
	}
}