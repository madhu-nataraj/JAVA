import java.util.ArrayList;
class first
{
	public static void main(String args[])
	{
		ArrayList<Integer> ab=new ArrayList<Integer>();
		ab.add(10);
		ab.add(20);
		ab.add(30);
		ab.add(40);
		ab.add(50);
		for(int i=0;i<ab.size();i++)
		{
			System.out.println(ab.get(i));
		}
	}
}
