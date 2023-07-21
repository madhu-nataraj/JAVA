import java.util.*;
import java.lang.math;
class disarium
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,q,p,sum;
		while(n>0)
		{
			q=n/10;
			sum=q;
		    count++;
		while(n>0)
		{
			p=(math.pow(q,count));
			count--;
		}
		}
	}
}
			
			
			
			