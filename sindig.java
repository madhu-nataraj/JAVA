import java.util.*;
class sindig
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j,out,r,q;
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		r=sum%10;
		q=sum/10;
		out=r+q;
		System.out.print(out);
	}
}