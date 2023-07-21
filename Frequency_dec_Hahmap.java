import java.util.*;

class Frequency_dec_Hahmap
{
	public static void find_freq(String str)
	{
		HashMap<Character,Integer> hm = new HashMap<>();
		char ch[]=str.toCharArray();
		for(char c : ch)
		{
		   if(hm.containsKey(c))
		   {
			   hm.put(c,hm.get(c)+1);
		   }
           else
		   {
			   hm.put(c,1);
		   }			   
	    }   
		System.out.println(hm);
		
		int len=hm.size();
		List<Map.Entry<Character,Integer>> li = new ArrayList<>(hm.entrySet());
		Collections.sort(li,Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		for(Map.Entry<Character,Integer> temp : li)
		{
			System.out.println(temp.getKey() +" : " + temp.getValue());
        }			

	}
	
	
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    find_freq(str);	
}	
}