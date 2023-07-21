import java.util.*;
class trailzero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		{
			int n=sc.nextInt();
			int i,fact=1,rem;
			int count=0;
			for(i=1;i<=n;i++)
			{
				fact*=i;
			}
			System.out.println(fact);
			do
			{
				rem=fact%10;
				if(rem==0)
				{
					count++;
				}
				fact=fact/10;
			}while(fact<10);
			System.out.println(count);
		}
	}
}