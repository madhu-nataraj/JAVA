import java.util.*;
class dog extends animal{
	void bark()
	{
		System.out.println("barking...");
	}
}
class animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class singleinher
{
	public static void main(String[] args){
	dog d=new dog();
	d.eat();
	d.bark();
	}
}