import java.util.*;
class ascii
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A=
		System.out.print(A);
	}
}

class GFG {
 
    // Return the maximum water that can be stored
    static int maxWater(int height[], int n)
    {
        int max = 0;
 
        // Check all possible pairs of buildings
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int current
                    = (Math.min(height[i], height[j])
                       * (j - i - 1));
 
                // Maximum so far
                max = Math.max(max, current);
            }
        }
        return max;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int height[] = { 2, 1, 3, 4, 6, 5 };
        int n = height.length;
        System.out.print(maxWater(height, n));
    }
}