import java.util.*;
class adtriple
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n=sc.nextInt();
		int i,j,k;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]<=t)
					{
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}