import java.util.*;
class animal
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class dog extends animal{
	void bark()
	{
		System.out.println("barking...");
	}
}
class babydog extends dog{
	void weep()
	{
		System.out.println("weeping...");
	}
}
class multilevel
{
	public static void main(String[] args){
	babydog d=new babydog();
	dd.bark();
	d.eat();
	d.weep();
	}
}