package HashMap;
import java.util.*;

public class TypeHashMap {


    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Indor", 170);
        hm.put("China", 150);
        
        LinkedHashMap<String, Integer> Lhm = new LinkedHashMap<>();
        Lhm.put("India", 100);
        Lhm.put("Indor", 170);
        Lhm.put("China", 150);
        
        TreeMap<String, Integer> Thm = new TreeMap<>();
        Thm.put("India", 100);
        Thm.put("Indor", 170);
        Thm.put("China", 150);
        
        System.out.println("It is HashMap..");
        System.out.println(hm);
        System.out.println("It is LinkedHashMap..");
        System.out.println(Lhm);
        System.out.println("It is TreeMap..");
        System.out.println(Thm);
    }
}