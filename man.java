import java.util.*;
abstract class abst
{
	abstract void input();
}
class ind extends abst{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==t)
			{
				System.out.print(i);
		    }
		}
	}
}
class man
{
	public static void main(String[] args)
	{
	ind obj=new ind();
	obj.input();
	}
}