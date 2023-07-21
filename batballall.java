import java.util.*;
interface bat{
	public void bat();
}
interface bowl{
	public void bowl();
}
interface allround extends bat,bowl
{
	public void both();
}
class child implements allround
{
	public void bat()
	{
		System.out.println("I AM A BATSMAN");
	}

	public void bowl()
	{
		System.out.println("I AM A Bowler too");
	}

	public void both()
	{
		System.out.println("i am a batsman and bowler");
	}
}
class batballall
{
	public static void main(String args[])
	{
		child c=new child();
		c.bat();
		c.bowl();
		c.both();
	}
}