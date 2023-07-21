import java.util.*;
class rpat
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0||i==n-2||j==0||j==n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for(i=n-1;i<n+2;i++)
		{
			for(s=1)
			for(j=i/2;j<n;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}