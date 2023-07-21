import java.util.*;
class binloop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(j%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
		System.out.print("\n");
		}
	}
}