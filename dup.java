import java.util.*;
class dup
{
	public static void main(String[] args)
	{
		int c,i,j;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=a.split(" ");
		c=b.length;
		//System.out.print(c);
		for(i=0;i<c-1;i++)
		{
			int count=0;
			for(j=i+1;j<c;j++)
			{
				if(b[i].equals(b[j]))
				{
					//System.out.print("ifff");
					count++;
					b[j]="0";
				}
			}
			
			if(count>0 && b[i]!= "0")
			{
			System.out.print(b[i]  +count);
			}
			
		}

	}
}