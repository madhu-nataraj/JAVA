import java.util.*;
class complex
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println((a+c)+"+"+(b+d)+"i");
		System.out.println((a-c)+"+"+(b-d)+"i");
		System.out.println(((a*c)-(b*d))+"+"+((a*d)-(b*c))+"i");
	}
}