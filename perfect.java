import java.util.*;
class perfect
{
	perfect()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,i;
		
		for(i=1;i<n-1;i++)
		{
			if(n%i==0)
			{
				count=count+i;
			}
		}
		if(count==n)
		{
			System.out.print("it is perfect");
		}
		else
		{
			System.out.print("it is not perfect");
		}
	}
	public static void main(String args[])
	{
		perfect obj = new perfect();
	}
}
				 
				