import java.util.*;
class t
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		int size=sc.nextInt();
		int[] a= new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(i%2!=0)
			{
				count=count+a[i];
			}
				
		}
		System.out.println(count);
	}
}
		