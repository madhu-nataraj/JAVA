import java.util.*;
class overload1
{
	void poly(int i)
	{
		System.out.println("Madhu");
	}
	void poly(double f)
	{
		System.out.println("wlcome");
	}
	void poly(String s)
	{
		System.out.println("java");
	}
	public static void main(String args[])
	{
		overload1 obj=new overload1();
		obj.poly(4.4);
		obj.poly(5);
		obj.poly("abc");
		
	}
}