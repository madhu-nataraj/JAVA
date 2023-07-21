import java.util.*;
class PolymerReaction{
    public static int reactPolymer(String polymer) {
        StringBuilder sb = new StringBuilder(polymer);
        int i = 0;
        while (i < sb.length() - 1) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            if (c1 != c2 && Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
                sb.delete(i, i + 2);
                i = Math.max(0, i - 1);
            } else {
                i++;
            }
        }
        return sb.length();
    }
}
class as1
{
    public static void main(String[] args) {
        String polymer = "dabAcCaCBAcCcaDA";
		PolymerReaction pr=new PolymerReaction();
		pr.reactPolymer(String polymer);
        System.out.println(reactPolymer(polymer)); // Output: 10
    }
}
