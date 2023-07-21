import java.util.*;
class pali
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int len=c.length;
		int i,j,count=0,k,l;
		for(i=0;i<len;i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		
		for(i=0;i<len;i++)
		{
			if(i==len/2)
			{
				for(j=1;j<=len/2-1;j++)
				{
				for(k=0;k<i-j;k++)
				{
					System.out.print(c[k]);
					
				}
				System.out.print(" ");
				if(c[i-1]==c[i+1])
				{
					System.out.print(c[i-1]);
					System.out.print(c[i]);
					System.out.print(c[i+1]);
				}
				System.out.print(" ");
				for(l=i+j+1;l<len;l++)
				{
					
					System.out.print(c[l]);
					
				}
				}
				System.out.print("\n");
				
			}
			
		}
		for(i=0;i<len;i++)
		{
			System.out.print(c[i]);
		}
	}
}