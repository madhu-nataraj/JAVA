import java.util.*;
class hel
{
	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		String l="";
		System.out.println("str");
		l = in.next();
		System.out.println(l.length());
		System.out.print("\n");	
		for(int sp=0;sp<l.length()-1;sp++)
		{
			System.out.printf(" ");
		}
		for(int i= l.length()-1;i<sp+5;i++)
		{
			System.out.print("*");
			System.out.print(" ");
		}
		for(int sp=0;sp<l.length()-1;sp++)
		{
			System.out.print(" ");
		}
		for(int i=0;i<l.length();i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for(int i=0;i<l.length()-1;i++)
		{
			System.out.print("*");
		}
		{
			System.out.print(l);
		}
		for(int i=0;i<l.length()-1;i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for(int sp=0;sp<l.length()-1;sp++)
		{
			System.out.print(" ");
		}
		for(int i=0;i<l.length();i++)
		{
			System.out.print("*");
		}
	}
}