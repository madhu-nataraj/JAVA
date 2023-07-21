import java.util.*;
class onezero
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i%2==0&&j%2==0||i%2!=0&&j%2!=0)
					{
					System.out.print("x");
					}
					else
					{
					System.out.print("o");
					}
			}
			System.out.print("\n");
		}
	}
}