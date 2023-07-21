import java.util.*;
class bintodec
{  
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		String bs=sc.next();  
		int decimal=Integer.parseInt(bs,2);
		System.out.println(decimal);  
	}
}