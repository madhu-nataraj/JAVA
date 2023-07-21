import java.util.*;
class overriding
{
	void ride()
	{
		System.out.println("parent");
	}
}
class over extends overriding
{
	void ride()
	{
		System.out.println("child");
	}
	public static void main(String args[])
	{
		over obj=new over();
		obj.ride();
	}
}