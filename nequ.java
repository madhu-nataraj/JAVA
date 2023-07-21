import java.util.*;
class nequ
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int i,j;
		int l=a.length();
		int n=sc.nextInt();
		int d=l/n;
		for(i=0;i<l;i++)
		{
			String s="";
			for(j=d*i;j<(i+1)*d;j++)
			{
				s=s+a.charAt(j);
			}
			System.out.println(s);
		}
	}
}
		