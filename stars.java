import java .util.*;
class stars
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<i+1;j++)
{
System.out.print("*");
}
System.out.print("\n");
i++;
}
System.out.print("\n");
System.out.print("\n");

/*forint (i = n - 2; i >= 1; i -= 2)
{
for(int j = 1; j <= i; j++)
{ed
System.out.print("*");
}
System.out.print("\n");
//i++;
}
}
}*/
 for (int i = n ; i >= 1; i --) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
			i--;
        }
    }
}