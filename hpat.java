import java.util.*;
{
	public static void main(String[] args)
	{
		int n=9;
		for(int i=1;i<n*2;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.print("#");
			}
			for(int k=j;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int l=k;l=n+2;l++)
			{
				System.out.print("$");
			}
			for(int k=j;k<=n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2;j++)
			{
				System.out.print("#");
			}
		}
	}
}