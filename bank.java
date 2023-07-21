import java.util.*;
class bankA
{
	void getbalance()
	{
	int a=1000;
	System.out.print(a);
	}
}
class bankb extends bankc
{
	void getbalance()
	{
	int b=1500;
	System.out.print(b);
	}
}
class bankc
{
	void getbalance()
	{
	int c=2000;
	System.out.print(c);
	}
}
class bank extends bankA
{
	public static void main(String args[])
	{
		bankA ba=new bankA();
		ba.getbalance();
		bankb bb=new bankb();
		bb.getbalance();
		bankc bc=new bankc();
		bc.getbalance();
	}
}