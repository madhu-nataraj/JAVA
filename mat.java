import java.util.*;
class mat
{
  public static void main(String[] args) 
  {
    int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] B = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
    int rows = A.length;
    int columns = A[0].length;
    int[][] C = new int[rows][columns];
    for (int i = 0; i < rows; i++) 
	{
      for (int j = 0; j < columns; j++) 
	  {
		if(i==j)
		{
        C[i][j] = A[i][j] + B[i][j];
		}
      }
    }
    System.out.println("The adi: ");
    for (int i = 0; i < rows; i++) 
	{
      for (int j = 0; j < columns; j++) 
	  {
        System.out.print(C[i][j] + " ");
      }
      System.out.println();
    }
  }
}
