import java.util.ArrayList;

public class Que2 {
    public static void main(String[] args) {
        int L = -10;
        int R = 10;
        int k = 8;
        ArrayList<Integer> range = new ArrayList<>();
        for (int i = L; i <= R; i++) {
            if (i % 2 == -1 || i % 2 == 1) {
                range.addFirst(i);
            }
        }
        System.out.print(range.get(k-1));
    }
}
