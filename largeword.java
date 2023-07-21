import java.util.*;
class largeword
{
	public static void main(String[] args)
	{
		int c,i,j;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=a.split(" ");
		c=b.length;
		//Arrays.sort(b[i].length());
		for(i=0;i<c;i++)
		{
			for(j=0;j<c;j++)
			{
				if(b[i].length()>b[j].length())
				{
					String temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(i=0;i<c;i++)
		{
			System.out.print(" "+b[i]);
		}
		System.out.println("largest word"+b[0]);
		System.out.println("smallest word"+b[c-1]);
	}
}
					
					