import java.util.*;
class divtrap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=n;i<=1;i--)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(i+"*");
			}
		}
	}
}