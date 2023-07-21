import java.util.*;
class bin
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int d=n^m;
	int o=0;
	int z=0;
	while(d>0)
	{
		if((d & 1)==1)
		{
			o++;
		}
		else
		{
			z++;
		}
		d=d>>1;
	}
	System.out.println(o);
	//System.out.println(z);
	}
}