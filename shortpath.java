import java.util.*;
class shortpath
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int temp=0;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n>=2)
		{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
	}
}