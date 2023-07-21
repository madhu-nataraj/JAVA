import java.util.*;
class freq
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int i,j;
	String n=sc.nextLine();
	char[] a=n.toCharArray();
	for(i=0;i<n.length();i++)
	{
		System.out.print(a[i]);
	}
	for(i=0;i<n.length();i++)
	{
		
		int count=0;
		for(j=0;j<n.length();j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		{
		System.out.println(a[i]+" "+count);
		}
	}
	}
}