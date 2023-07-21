import java.util.*;
class equ
{
	public static void main(String[] args)
	{
		int n,m,i,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int count=0;
		if(n==m)
		{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}
		}
		if(count==n)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}