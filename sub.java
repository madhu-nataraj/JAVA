import java.util.*;
class sub
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if((a[i]*a[j])<k)
				{
					count++;
				}
			}
		}
		System.out.print(count);
	}
}
















public class BulbSwitching {
    public static int minSwitches(int[] bulbs) {
        int count = 0; // count of switches pressed
        int n = bulbs.length;
        int flipped = 0; // number of bulbs to the left that have been flipped
        for (int i = 0; i < n; i++) {
            if ((bulbs[i] + flipped) % 2 == 0 && bulbs[i] == 0) {
                // switch on the bulb and flip all bulbs to the right
                bulbs[i] = 1;
                count++;
                flipped++;
            } else if ((bulbs[i] + flipped) % 2 == 1 && bulbs[i] == 1) {
                // flip all bulbs to the right
                flipped++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] bulbs1 = {0, 1, 0, 1};
        int[] bulbs2 = {1, 0, 0, 0, 0};
        System.out.println(minSwitches(bulbs1)); // Output: 4
        System.out.println(minSwitches(bulbs2)); // Output: 1
    }
} 