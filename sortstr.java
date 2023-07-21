import java.util.*;
class sortstr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c,i,j;
		String a=sc.nextLine();
		String[] b=a.split(" ");
		c=b.length;
		String temp=" ";
		for(i=0;i<c;i++)
		{
			for(j=0;j<c;j++)
			{
				if(b[i].length()<b[j].length())
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(i=0;i<c;i++)
		{
			System.out.print(b[i]+"  ");
		}
	}
}