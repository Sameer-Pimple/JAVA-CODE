package HashSet;
import java.util.*;

public class TypeHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Noida");
        set.add("Bengaluru");
        System.out.println(set);

        LinkedHashSet<String> Lset = new LinkedHashSet<>();
        Lset.add("Delhi");
        Lset.add("Mumbai");
        Lset.add("Noida");
        Lset.add("Bengaluru");
        System.out.println(Lset);

        TreeSet<String> Tset = new TreeSet<>();
        Tset.add("Delhi");
        Tset.add("Mumbai");
        Tset.add("Noida");
        Tset.add("Bengaluru");
        System.out.println(Tset);


    }
}