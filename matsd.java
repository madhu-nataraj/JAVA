import java.util.*;
class matsd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i!=n/2||j!=n/2)
				{
					a[i][j]=a[i][j]+5;
				}
			}
			System.out.print("*")
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
	}
}