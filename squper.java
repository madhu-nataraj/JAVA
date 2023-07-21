import java.util.*;
class squper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a*a;
		int add=0;
		if(a<100)
		{
		int c=b/100;
		System.out.println(c);
		int d=b%100;
		System.out.println(d);
		add=c+d;
		System.out.print(add);
		}
		if(a>=100)
		{
		int c=b/1000;
		System.out.println(c);
		int d=b%1000;
		System.out.println(d);
		add=c+d;
		System.out.print(add);
		}
		if(add==a)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}