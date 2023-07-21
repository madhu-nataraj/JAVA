import java.util.*;
class anagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0,i,j;
		String str1="";
		String str2="";
		str1=sc.next();
		str2=sc.next();
		int s1=str1.length();
		int s2=str2.length();
		char[] a= new char[str1.length()];
		char[] b= new char[str2.length()];
		if(s1==s2)
		{
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b))
		{
			System.out.print("Anagram");
		}
		else
		{
			System.out.print("not Anagram");
		}
		}            
	}
}
			
			