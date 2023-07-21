import java.util.*;
class lettercount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char b= sc.next().charAt(0);
		char[] a=s.toCharArray();
		int l=a.length;
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]==b)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}