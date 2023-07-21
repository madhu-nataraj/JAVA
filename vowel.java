import java.util.*;
class vowel
{
	public static void main(String[] args)
	{
		int count=0,i,EC=0;
		String str="educationinenglish";
		for(i=0;i<str.length();i++)
		{
			char d =str.charAt(i);
			switch(d)
			{
			case 'a':count++;
			         break;
			case 'e':count++;
			         EC++;
			         break;
			case 'i':count++;
			         break;
			case 'o':count++;
			         break;
			case 'u':count++;
				     break;
			}
		}
		System.out.print(count);
		System.out.print(EC);
	}
}