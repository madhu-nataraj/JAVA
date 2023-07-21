import java.util.*;
class sumtwo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==t)
				{
					System.out.println(a[i]+"+"+a[j]+"="+t);
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("no 2 values sum up to "+t);
		}
	}
}