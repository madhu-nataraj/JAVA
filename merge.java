import java.util.*;
class merge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		String[] a=new String[n];
		String[] b=new String[n];
		int lena=a.length;
		int lenb=b.length;
		int lenc=lena+lenb;
		String[] c=new String[lenc];
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(i=0;i<n;i++)
		{
			b[i]=sc.next();
		}
		for(i=0;i<lena;i++)
		{
			c[i]=a[i];
		}
		for(i=0;i<lenb;i++)
		{
			c[lena + i]=b[i];
		}
		for(i=0;i<lenc;i++)
		{
			System.out.print(c[i]+" ");
		}
		Arrays.sort(c);
		for(i=0;i<lenc;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}