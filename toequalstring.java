import java.util.*;
class toqualstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		String[] a=s.toCharArray();
		String[] b=t.toCharArray();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	// A Space efficient Dynamic Programming
// based Java program to find minimum
// number operations to convert str1 to str2
import java.util.*;

class Solution {
	// space optimization
	public int editDistance(String s, String t)
	{
		int n = s.length();
		int m = t.length();

		int[] prev = new int[m + 1];
		int[] curr = new int[m + 1];

		for (int j = 0; j <= m; j++) {
			prev[j] = j;
		}

		for (int i = 1; i <= n; i++) {
			curr[0] = i;
			for (int j = 1; j <= m; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					curr[j] = prev[j - 1];
				}
				else {
					int mn = Math.min(1 + prev[j],
									1 + curr[j - 1]);
					curr[j] = Math.min(mn, 1 + prev[j - 1]);
				}
			}
			prev = curr.clone();
		}

		return prev[m];
	}
}

public class Main {
	public static void main(String[] args)
	{
		String s = "geek";
		String t = "gesek";

		Solution ob = new Solution();
		int ans = ob.editDistance(s, t);
		System.out.println(ans);
	}
}
*/