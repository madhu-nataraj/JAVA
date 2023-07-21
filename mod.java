import java.util.*;
class mod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,temp=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int count=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}
			if(count>1 && a[i]!=-1)
			{
				System.out.println(a[i]+" ");
				temp++;
			}
			
		}
		System.out.println("total repeated elements are:"+temp);
		
	}
}
					
					