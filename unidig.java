import java.util.*;
class unidig
{
	public static void main(String args[])
	{
		int s,f,k;
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		f=sc.nextInt();
		k=sc.nextInt();
		int count=0;
		 for (int i = s; i <= f; i++) 
            if (i % 10 == k)
                count++;
			System.out.print(count);
	}
}