import java.util.*;
class countchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int n=c.length;
		System.out.print("{");
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=0;j<n;j++)
			{
				if(c[i]==c[j])
				{
					count=count+1;
					c[j]=' ';
				}
				System.out.print(c[i]+":"+count+" ");
			}
		}
		System.out.print("}");
	}
}