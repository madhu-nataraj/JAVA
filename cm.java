import java.util.*;
public class cm {
    
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
