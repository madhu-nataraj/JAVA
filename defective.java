import java.util.*;
class defective
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int b3=sc.nextInt();
		int b4=sc.nextInt();
		int b5=sc.nextInt();
		int b6=sc.nextInt();
		int b7=sc.nextInt();
		int b8=sc.nextInt();
		int c1=b1+b2+b3;
		int c2=b4+b5+b6;
		int c3=b7+b8;
		if(c1==c2)
		{
			System.out.println("c3 have defective");
			if(b7<b8)
			{
				System.out.println("b7 is defective");
			}
			else
			{
				System.out.println("b8 is defective");
			}
		}
		else if(c1<c2)
		{
			System.out.println("c1 have defective");
			if(b1<b2 && b1<b3)
			{
				System.out.println("b1 is defective");
			}
			else if(b2<b1 && b2<b3)
			{
				System.out.println("b2 is defective");
			}
			else
			{
				System.out.println("b3 is defective");
			}
		}
		else if(c1>c2)
		{
			System.out.println("c2 have defective");
			if(b4<b5 && b4<b6)
			{
				System.out.println("b4 is defective");
			}
			else if(b5<b6 && b5<b4)
			{
				System.out.println("b5 is defective");
			}
			else
			{
				System.out.println("b6 is defective");
			}
		}
	}
}