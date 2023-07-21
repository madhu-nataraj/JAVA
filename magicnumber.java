import java.util.*;
class magicnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(i==a[i])
			{
				System.out.print("The magic number is:"+" "+a[i]);
			}
		}
	}
}