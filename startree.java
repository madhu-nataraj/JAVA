import java.util.*;
class startree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,s;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(s=0;s<n-i-1;s++)
			{
				System.out.print(" ");
			}
			for(j=0;j<n-s;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		for(i=1;i<n;i++)
		{
			for(s=0;s<i;s++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=n-1-i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}