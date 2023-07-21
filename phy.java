import java.util.*;
class phy
{
    public static void main(String args[])
    {
        String a = "PHYSICS";
        int len=a.length(),i,j;
        char[][] b = new char[len][len];
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                if(i==len/2)
                {
                    b[i][j]=a.charAt(j);
                    System.out.print(b[i][j]+" ");
                }
                else if(j==len/2)
                {
                    b[i][j]=a.charAt(i);
                    System.out.print(b[i][j]);
                }
                else
                {
                    System.out.print("  ");
                }
            }
			System.out.print("\n");
		}
	}
}
