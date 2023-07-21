import java.util.*;
class rearrangement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char temp=0;
		char[] a=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(a[i]!=a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				else
				{
					
				}
			}
		}
		for(int i=0;i<str.length();i++)
		{
		System.out.print(a[i]);
		}
	}
}