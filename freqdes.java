import java.util.*;
class freqdes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(c[i]!=0)
			{
			for(int j=i+1;j<n;j++)
			{
				if(c[i]==c[j])
				{
					count=count+1;
					c[j]=0;
				}
			}
			System.out.print(c[i]+":"+count+" ");
			}
			
		}
		
	}
}