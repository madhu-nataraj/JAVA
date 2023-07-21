import java.util.*;
class evenodd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j,temp=0;
		int[] a=new int[n];
		int[] b=new int[n];
		int[] c=new int[n];
		int[] d=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
				if(a[i]%2==1)
				{
					b[i]=a[i];
				}
				if(a[i]%2==0)
				{
					c[i]=a[i];
				}
		}
		int e=b.length;
		int f=c.length;
		for(i=0;i<e;i++)
		{
			for(j=0;j<e;j++)
			{
			if(b[i]<b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
			}
		}
		for(i=0;i<f;i++)
		{
			for(j=0;j<f;j++)
			{
			if(c[i]>c[j])
			{
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
			}
			}
		}
		System.out.print(e);
		System.out.print(f);
		for(i=0;i<e;i++)
		{
			d[i]=b[i];
		}
		for(i=0;i<f;i++)
		{
			d[(e)+i]=c[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(d[i]);
		}
	}
}