import java.util.*;
class quad
{
 void solve()
 {
   Scanner obj=new Scanner(System.in);
   int x=obj.nextInt();
   int y=obj.nextInt();
   int a=obj.nextInt();
   int b=obj.nextInt();
   int h=obj.nextInt();
   }
   }
   class rect extends quad
   {
    void rect()
	{
	  Scanner obj=new Scanner(System.in);
	  int x=obj.nextInt();
      int y=obj.nextInt();
	  int area=x*y;
	  System.out.print("area:"+area);
	}
   }
   class square extends quad
   {
    void sqr()
	{
	  Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt();
	  int area1=a*a;
	  System.out.print("area1:"+area1);
	}
   }
   class parall extends quad
   {
    void para()
	{
	  Scanner obj=new Scanner(System.in);
	  int b=obj.nextInt();
      int h=obj.nextInt();
	  int area2=b*h;
	  System.out.print("area2:"+area2);
	}
   }
   class trapez extends quad
   {
    void trap()
	{
	  Scanner obj=new Scanner(System.in);
	  int a=obj.nextInt();
      int b=obj.nextInt();
	  int h=obj.nextInt();
	  double area3=a+b*0.5*h;
	  System.out.print("area3:"+area3);
	}
   }
   class main
   {
   public static void main(String args[])
   {
     
	 rect r=new rect();
	 r.rect();
	 square s=new square();
	 s.sqr();
	 parall p=new parall();
	 p.para();
	 trapez t=new trapez();
	 t.trap();
}
 }