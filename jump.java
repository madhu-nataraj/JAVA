import java.util.*;
class jump
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=n/2;
		if(n%2==0)
		{
			System.out.println(a);
		}
		if(n%2!=0)
		{
			System.out.println(a+1);
		}
	}
}