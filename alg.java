import java.io.*;
import java.util.*;
class MatrixChainMultiplication {
 
    // Matrix Ai has dimension p[i-1] x p[i]
    // for i = 1 . . . n
    static int MatrixChainOrder(int p[], int i, int j)
    {
        if (i == j)
            return 0;
 
        int min = Integer.MAX_VALUE;
 
        // Place parenthesis at different places
        // between first and last matrix,
        // recursively calculate count of multiplications
        // for each parenthesis placement
        // and return the minimum count
        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(p, i, k)
                        + MatrixChainOrder(p, k + 1, j)
                        + p[i - 1] * p[k] * p[j];
 
            if (count < min)
                min = count;
        }
 
        // Return minimum count
        return min;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int N = arr.length;
 
        // Function call
        System.out.println(
            "Minimum number of multiplications is "
            + MatrixChainOrder(arr, 1, N - 1));
    }
}
/* This code is contributed by Rajat Mishra*/






public class MatrixChainMultiplication {
    
    public static int matrixChainMultiplication(int[] arr) {
        int n = arr.length;
        int[][] m = new int[n][n];
        
        
        for (int i = 1; i < n; i++) {
            m[i][i] = 0;
        }
		
        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) 
			{
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) 
				{
                    int q = m[i][k] + m[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if (q < m[i][j]) 
					{
                        m[i][j] = q;
                    }
                }
            }
        }
        
        return m[1][n-1];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int result = matrixChainMultiplication(arr);
        System.out.println("Minimum number of multiplications is " + result);
    }
}
