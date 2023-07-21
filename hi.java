import java.util.*;
class hi
{
	public static void main(String[]args)
	{
		Scanner in =new Scanner(System.in);
		String l="";
		String R = "";
		String s = "";
		System.out.println("str");
		l = in.next();
		System.out.println("string");
		s = in.next();
		System.out.println("string");
		R= in.next();
		int count = 0;
		System.out.println(l.length());
		System.out.println(s.length());
		System.out.println(R.length());
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
		System.out.println("\n");
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print("*");
		}
		{
			System.out.print(s);
		}
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.print("*");
		}
		System.out.println("\n");
		for(int i=0;i<R.length()-1;i++)
		{
			System.out.print("*");
		}
		{
			System.out.print(R);
		}
		for(int i=0;i<R.length()-1;i++)
		{
			System.out.print("*");
		}
	}
}