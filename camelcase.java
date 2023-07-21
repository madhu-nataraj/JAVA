import java.util.*;
class camelcase
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		int b=s1.length;
		int i;
		for(i=0;i<b;i++)
		{
			if(i==0)
			{
				s1[i]=Character.toUpperCase(s1[i]);
			}
			else if(s1[i]==' ')
			{
				s1[i+1]=Character.toUpperCase(s1[i+1]);
			}
		}
		System.out.print(s1);
	}
}