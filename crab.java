import java.util.*;
class crab
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int d,i,j,m=0;
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		int sum=0;
		for(j=0;j<n;j++)
		{
			d=a[i]-(i+1);
			sum=sum+d;
			m=sum;
		}
			if(sum<=m)
			{
			System.out.print(sum);
			System.out.println(i+1);
			}
	}
	}
}