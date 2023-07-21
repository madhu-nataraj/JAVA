import java.util.*;
class h
{
	public static void main(String[] args);
	Scanner n1 =new Scanner(System.in);
    int l= n1.nextInt();
	for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
		System.out.println("\n");
		}
	
	
}
import java.util.*;
class star
{
	public static void main(String[] args)
	{
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("#");
			}
		System.out.println("\n");
		}
	
	}
	
	
	import java.util.*;
class star
{
	public static void main(String[] args)
{
    char letter;
    String s = "";
    System.out.println("Enter a character for which to search");
    letter = in.next().charAt(0);
    System.out.println("Enter the string to search");
    s = in.next();

    int count = 0;
    for (int i = 0; i < sentence.length(); i++) {
        char ch = sentence.charAt(i);
        if (ch == letter) {
            count++;
        }
    }
    System.out.printf("There are %d occurrences of %s in %s", count,letter, s);

}