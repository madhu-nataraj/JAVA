import java.util.*;
class b
{
	int b=10;
}
class c extends b
{
	int c=9;
}
class d extends b
{
	int d=8;
}
class e extends class{
	int e=11;
}
class hyb
{
	public static void main(String args[])
	{
		e obj=new e();
		System.out.println(obj.e);
	}
}