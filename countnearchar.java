import java.util.*;
class countnearchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i;
		char[] a=s.toCharArray();
		int l=a.length;
		for(i=0;i<l;i++)
		{
			int count=1;
			while(i<l-1 && a[i]==a[i+1])
			{
					count++;
					i++;
			}
			System.out.println(a[i]+" "+count);
		}
	}
}