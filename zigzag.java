import java.util.*;
class zigzag
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int i,j,temp=0;
	int n=sc.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(i=1;i<n;i++)
	{
		if(i%2!=0)
		{
		for(j=i+1;j<=i+1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
	}
}

