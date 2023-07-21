import java.util.*;
class spy
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s= Integer.toString(n);
		int l=s.length();
		int i;
		for(i=0;i<l;i++)
		{
			System.out.println(s.CharAt(i));
		}
		
	}
}
		