import java.util.*;
interface one
{
	void chil();
}
interface two
{
	void child();
}
interface three extends one,two
{
	void chil();
}
class A
{
	void bas()
	{
	System.out.println("A");
	}
}
class B extends A
{
	void chil()
	{
	System.out.println("B");
	}
}
class C extends A
{
	void child()
	{
	System.out.println("C");
	}
}
class D implements three
{
	void sub()
	{
	System.out.println("D");
	}
}
class hybrid
{
	public static void main(String args[])
	{
		D x=new D();
		x.sub();
		x.child();
		x.chil();
		x.bas();
	}
}