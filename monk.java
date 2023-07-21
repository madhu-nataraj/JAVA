import java.util.*;
class monkey
{
	void jump()
	{
		System.out.println("jump");
	}
	void bite()
	{
		System.out.println("Bite");
	}
}
class human extends monkey implements animal
{
	public void eat()
	{
		System.out.println("eat");
	}
	public void sleep()
	{
		System.out.println("sleep");
	}
}
interface animal
{
	void eat();
	void sleep();
}
class monk
{
	public static void main(String args[])
	{
		human h=new human();
		h.jump();
		h.bite();
		h.eat();
		h.sleep();
	}
}