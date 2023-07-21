import java.util.*;
class tt
{
	void display()
		{
		System.out.println("OUTPUT");
		System.out.println(count);
		{
		for(i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]);
			}
		}
		}
{
	public Static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		int size=sc.nextInt();
		int[] a= new int[size];
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		tt ob=new tt();
		obj.display();
	}
}
}