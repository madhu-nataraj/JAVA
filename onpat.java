import java.util.*;
class onpat
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,s;
		for(i=0;i<n;i++)
		{
			for(s=0;s<n-i-1;s++)
			{
				System.out.print("1");
			}
			for(j=0;j<n-s;j++)
			{
				System.out.print(i+1);
			}
		System.out.print("\n");
		}
	}
}