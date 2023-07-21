import java.util.*;
class station
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int sta=n-s;
		int mult=0;
		int m=0;
		for(int i=sta+1;i<=n;i++)
		{
			mult*=i;
		}
		for(int i=s;i<0;i++)
		{
			m*=i;
		}
		int d=mult/m;
		System.out.print(d);
	}
}
			
			
			