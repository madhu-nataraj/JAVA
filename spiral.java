import java.util.Scanner;

 class spiral 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int rowmin = 1, rowmax = n, colmin = 1, colmax = m;
        int count = 1;
        while (rowmin <= rowmax) 
		{
            for (int i = colmin; i <= colmax; i++) 
			{
                arr[rowmin - 1][i - 1] = count++;
            }
            for (int i = rowmin + 1; i <= rowmax; i++) 
			{
                arr[i - 1][colmax - 1] = count++;
            }
            for (int i = colmax - 2; i >= colmin - 1; i--) 
			{
                arr[rowmax - 1][i] = count++;
            }
            for (int i = rowmax - 2; i > rowmin - 1; i--) 
			{
                arr[i][colmin - 1] = count++;
            }
            rowmin++;
            colmin++;
            colmax--;
            rowmax--;
        }
        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < m; j++)
			{
                //System.out.print(arr[i][j] + "\t");
				arr[i][j] =sc.nextInt();
            }
            System.out.println();
        }
		
		for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < m; j++)
			{
                System.out.print(arr[i][j] + "\t");
				
				//int[i][j] arr=sc.nextInt();
            }
            System.out.println();
        }
    }
}
