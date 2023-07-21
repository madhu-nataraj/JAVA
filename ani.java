import java.util.*;
class ani
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int sum=0,i,j,m=0;
	int n=sc.nextInt();
	int[] a= new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		sum=sum+a[i];
	}	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		if(a[i]>a[j])
		{
			 m=a[j];
		}
		}
	}
	System.out.print("OUTPUT");
	int x=m*n;
	System.out.println(sum-x);
	}
}
	
		