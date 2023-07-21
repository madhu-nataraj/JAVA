import java.util.*;
class tripenthex
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		for(i=0;i<t;i++)
		{
			String s=sc.nextLine();
			char[] s1=s.toCharArray();
			int n=s1.length;
			for(i=0;i<n-1;i++)
			{
				int count=0;
				for(j=i+1;j<n;j++)
				{
					if(s1[i]!=s1[j])
					{
						System.out.print(s1[i]);
						//System.out.print(s1[i+1]);
						count++;
					}
				}
				if(count==0)
				{
					System.out.println("-1");
				}
				if(n%2!=0)
				{
					System.out.print(s1[n-1]);
				}
			}
		}
	}
}