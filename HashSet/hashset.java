package HashSet;
import java.util.*;

public class hashset {
    /*
    Hashset Implemntes using HashMap
    LinkedHashSet Implements using LinkedHashmap
    TreeSet Implents using Treemap
    
    it did not coantain Duplicate value if we add 1,2,3,1 then it only stroe 1,2,3
    it is Unordered
     */
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.remove(2));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}
