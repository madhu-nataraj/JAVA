import java.util.*;
class parking
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,ind=0;
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int m=0;
		for(i=0;i<r;i++)
		{
			int count=0;
			for(j=0;j<c;j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
			}
			if(count>m)
			{
				m=count;
				ind=i;
			}
		}
		System.out.print(ind+1);
	}
}
				
					