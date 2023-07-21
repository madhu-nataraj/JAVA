import java.util.*;
class longconcat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
		String temp="";
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;i<n;i++)
			{
			 temp=a[i]+a[j];
			}
			System.out.print(temp);
		}
	}
}