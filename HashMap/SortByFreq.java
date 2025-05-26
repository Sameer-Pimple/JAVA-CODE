package HashMap;

/*
Given a string sort it in decreasing order based onthe frequency of the charactor.
The frq. of a chractor is the number of times it appres in the string.
Return the sorting string .if there are multiple ans retuen any of them.
 */
import java.util.*;
public class SortByFreq {
    public static void main(String[] args) {
        TreeMap<Integer,Character> map = new TreeMap<>();
        String s = "tree";
        List<Map.Entry> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(map.get(s.charAt(i)) + 1,s.charAt(i));
        }
        
        
        System.out.println(list);
    }
}
