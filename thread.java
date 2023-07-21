class newThreads extends Thread
{
	public void run()
	{
		for(i=1;i<=5;i++)
		{
			System.out.print("Hello");
		}
	}
}
	class thread
	{
		public static void main(String args[])
		{
			newThread nt=new newThread();
			nt.start();
		}
	}