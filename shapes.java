import java.util.*;
class quadril
{
	void quad()
	{
		int d=10,h1=5,h2=6;
		int h=h1+h2;
		int q=(d*h)/2;
		System.out.print(q);
	}
}
class square extends quadril
{
	void sq()
	{
		int a=4;
		int ar=a*a;
		System.out.println(ar);
	}
}
class rectangle extends quadril
{
	void rect()
	{
		int l=2;
		int b=3;
		int arr=2*(l+b);
		System.out.println(arr);
	}
}
class parallelogram extends quadril
{
	void para()
	{
		int b=2;
		int h=3;
		int arp=b*h;
		System.out.println(arp);
	}
}
class trapezoid extends quadril
{
	void trape()
	{
		int a=2;
		int b=4;
		int h=3;
		int c=a+b;
		int arp=(c*h)/2;
		System.out.println(arp);
	}
}
class shapes
{
	public static void main(String[] args)
	{
		rectangle r=new rectangle();
		r.rect();
		square s=new square();
		s.sq();
		parallelogram p=new parallelogram();
		p.para();
		trapezoid t=new trapezoid();
		t.trape();
		t.quad();
	}
}
