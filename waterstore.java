import java.util.*;
class waterstore
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max = 0;
        for (i=0;i<n-1;i++) 
		{
            for (int j=i+1;j<n;j++) 
			{
                int store= (Math.min(a[i], a[j])* (j - i - 1));
                max = Math.max(max, store);
            }
        }
		System.out.print(max);
	}
}
