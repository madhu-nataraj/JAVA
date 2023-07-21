import java.util.*;
class v
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,s;
		for(i=0;i<n;i++)
		{
			for(s=i;s<n;s++)
			{
				System.out.print(" ");
			}
				for(j=i;j<n;j++)
				{
					if(i==j)
					{
					System.out.print(i+1);
					}
					for(i=0;i<n;i++)
					{
						for(s=0;s<2*n;s--)
						{
							System.out.print(" ");
						}
						for(j=n;j<2*n;j++)
						{
							System.out.print(n*2);
						}
					}
				}
				System.out.print("\n");
		}
	}
}