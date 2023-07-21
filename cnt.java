import java.util.*;
class cnt
{
	public static void main(String[] args)
{
    Scanner in =new Scanner(System.in);
	char l;
    String s = "";
    System.out.println("char");
	l = in.next().charAt();
    System.out.println("string");
    s = in.next();
    int count = 0;
    for (int i = 0; i < s.length(); i++)
		{
        char ch = s.charAt(i);
        if (ch == 1)
		{
            count++;
        }
    }
    System.out.printf("%d", count);

}
}