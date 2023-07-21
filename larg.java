import java.util.*;
class larg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				int next=-1;
				if(a[i]<a[j])
				{
					next=a[j];
					System.out.print("the next great element is  ");
					System.out.println(next);
					break;
				}
				else
				{
					System.out.println("-1");
				}
			}
		}
	}
}