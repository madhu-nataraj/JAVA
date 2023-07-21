import java.util.*;
class maxi
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int count=0;
			for(j=i;j<k*(i+1);j++)
			{
				if(a[i]>a[j])
				{
					count++;
					if(count>1)
					{
						System.out.print(a[i]);
					}
				}
			}
		}
	}
}