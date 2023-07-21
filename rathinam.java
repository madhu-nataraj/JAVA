import java.util.*;
class rathinam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] a=str.split(" ");
		int c=a.length;
		int i;
		for(i=0;i<c;i++)
		{
			System.out.println(a[i]);
		}
		System.out.print(c);
		for(i=0;i<c;i++)
		{
			int count=0;
			for(j=0;j<a[i].length;j++)
			{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				count++;
			}
			}
			System.out.print(count);
		}
	}
}