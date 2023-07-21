import java .util.*;
class frnd 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		int i,count=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=1;i<n;i++)
		{
			if(a[0]!=a[i])
			{
				count++;
			}
		} 
		System.out.println(count);
	}
}