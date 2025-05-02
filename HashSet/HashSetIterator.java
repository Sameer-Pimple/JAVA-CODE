package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
 public static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //there are 2 methods to iterate 
        
        //using a function(Itrator())
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        //using advance foreach loop
        for (Integer a : set) {
            System.out.println(a);
        }
 }   
}
