import java.util.*;
class numsum
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int sum=0,i;
		String s ="52prep2aration6";
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+(s.charAt(i)-48);
			}	
		}
		System.out.print(sum);
	}
}