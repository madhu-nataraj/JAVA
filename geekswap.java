import java.util.*;
class geekswap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		char temp=0;
		char temp1=0;
		String str1=sc.next();
		String str2=sc.next();
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		for(int i=0;i<str2.length();i++)
		{
			for(int j=i+1;j<str2.length();j++)
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
				for(i=0;i<str2.length();i++)
				{
					for(j=i+1;j<str2.length();j++)
					{
						if(b[i]==a[i])
						{
							count++;
						}
						else
						{
							System.out.println("No");
							temp1=b[j];
							b[j]=b[i];
							b[i]=temp1;
						}
						
					}
				}
			}
		}
	}
}










/*public class MetaStrings {
    public static boolean areMetaStrings(String str1, String str2) {
        // Check if both strings have same length
        if (str1.length() != str2.length()) {
            return false;
        }
        
        int count = 0;
        int prev = -1, curr = -1;
        
        // Traverse both strings and count the number of differences
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
                prev = curr;
                curr = i;
            }
        }
        
        // Check if there are exactly two differences and they can be swapped
        return (count == 2 && str1.charAt(prev) == str2.charAt(curr) && str1.charAt(curr) == str2.charAt(prev));
    }
    
    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "keegs";
        
        if (areMetaStrings(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
