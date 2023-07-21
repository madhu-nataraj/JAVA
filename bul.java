import java.util.*;
class bul
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,count=0,temp=0;
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			for (i = 0; i < n; i++) 
			{
            if ((a[i]+temp)%2 == 0 && a[i] == 0) 
			{
                a[i] = 1;
                count++;
                temp++;
            } 
			else if ((a[i] + temp) % 2 == 1 && a[i] == 1) 
			{
                temp++;
            }
			}
		System.out.print(count);
	}
}