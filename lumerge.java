import java.util.*;
class lumerge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[100];
		int i,c=0,b=0;
		while(true)
		{
			int start=sc.nextInt();
			int End=sc.nextInt();
			System.out.println(start+"-"+End);
			int count=0;
			for(i=0;i<10;i++)
		{
			a[i]=start;
			i++;
		}
		for(i=1;i<10;i++)
		{
			a[i]=End;
			i++;
		}
		if(count>0){
		if(start<=c&&End>=b)
		{
			System.out.print(start+"-"+End);
		}
		if(start>=c&&End>=b)
		{
			System.out.print(c+"-"+End);
		}
		if(start>=c&&End>=b)
		{
			System.out.print(c+"-"+End);
		}
		}
		count++;
		c=start;
		b=End;
	}
	}
}







































































/* Finding and merging Range values using arrays and lists
The program should have a method to insert values continuously until a break command is entered. There should be three inputs for each iteration such as start range value, end range value and Stored value. On every iteration the values should be checked and if there is a overlap then the minimum and maximum values should be adjusted and the values has to be added and displayed in a given format as below.

Example:

	Iteration 1:
	Enter Start Range : 10
	Enter End Range : 20
	Enter value to be stored : 6

	Range 	Value
	10-20 	6

	Iteration 2:
	Enter Start Range : 25
	Enter End Range : 40
	Enter value to be stored : 10

	Range 	Value
	10-20 	6
	25-40 	10
	
	Iteration 3:
	Enter Start Range : 50
	Enter End Range : 70
	Enter value to be stored : 5

	Range 	Value
	10-20 	6
	25-40 	10
	50-70 	5
	
	Iteration 4:
	Enter Start Range : 35
	Enter End Range : 55
	Enter value to be stored : 5

	Range 	Value
	10-20 	6
	25-70 	20
	
	Iteration 5:
	Enter Start Range : 13
	Enter End Range : 90
	Enter value to be stored : 4

	Range 	Value
	10-90 	30
  */