package HashMap;
import java.util.*;

public class Lque2 {//anagram menas 2 word which contain same and equal letters...
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch) && map.get(ch) <= 1) {
                map.remove(ch);
            }else if (map.containsKey(ch) && map.get(ch) >= 2 ) {
                map.put(ch, map.get(ch) - 1);
            } 
            else  {
                return false;
            }
        }
        if (map.isEmpty()) {
            return true;
        } else {
            return false;
        }
        
    }
    public static void main(String args[]) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s, t));
        

    }
}