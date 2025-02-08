import java.util.ArrayList;

public class PairSum1 {

    public static boolean Pairsum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp = -1; // breakpoint
        // Finding the breakpoint
        for (int i = 0; i < n - 1; i++) {  //to find out where arraylist rotate
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // Initialize lp and rp based on the breakpoint
        int lp = (bp + 1) % n; // left pointer
        int rp = bp;           // right pointer

        // Two pointer technique
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        
        return false; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(Pairsum2(list, target));
    }
}
