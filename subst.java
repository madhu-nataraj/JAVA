import java.util.*;
class subst
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-k+1;i++)
		{
			int m=0;
			for(j=i;j<i+k;j++)
			{
				 m=Math.max(m,a[j]);
			}
			System.out.println(m);
		}
	}
}