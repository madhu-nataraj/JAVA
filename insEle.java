import java.util.*;
class insEle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int p=sc.nextInt();
		//int q=sc.nextInt();
		ArrayList<Integer> madhu = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			madhu.add(sc.nextInt());
		}
		System.out.println(madhu);
		madhu.add(2,6);
		System.out.println(madhu);
		
}}
