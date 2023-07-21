 import java.util.*;
 class pic
 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		int l;
		l=sc.nextInt();
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("W:");
		int w=sc.nextInt();
		System.out.println("H:");
		int h=sc.nextInt();
		if((w&h)<l)
		{
			System.out.println("UPLOAD ANOTHER");
		}
		else if((w==h)&&(w>l))
		{
			System.out.println("ACCEPTED");
		}	
		else
		{
			System.out.println("CROP IT");
		}
		}
 }
 }