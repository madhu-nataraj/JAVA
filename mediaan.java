import java.util.*;
class mediaan
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mid=n/2;
		int i;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
		if(n%2==0)
			for(i=0;i<n;i++)
			{
				if(i==mid)
				{
					System.out.print(a[i]);
				}
			}
	}
}