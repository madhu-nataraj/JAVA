import java.util.*;
class ha
{
	public static void main(String[] args)
	{
		int i,j,n=9;
		for(i=0;i<n*2;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(j==1||j==2||j==n-1||j==n)
				{
					System.out.print("#");
				}
				System.out.println(" ");
			}
			System.out.println("\n");
		}
	}
}