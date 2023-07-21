import java.util.*;
class vowelupper
{
	public static void main(String[] args)
	{
		int count=0,i;
		String str="hi how are you";
		for(i=0;i<str.length();i++)
		
		{
			char d =str.charAt(i);
			if(d[i]='a'||d[i]='e'||d[i]='i'||d[i]='o'||d[i]='u')
			{
				d[i]=d[i]+32;
			}
		}
		for(i=0;i<str.length();i++)
		{
			System.out.print(d[i]);
		}
	}
}