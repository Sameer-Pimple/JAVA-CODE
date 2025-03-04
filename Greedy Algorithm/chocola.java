import java.util.Arrays;
import java.util.Collections;

public class chocola {
    public static void main(String[] args) {
        Integer costver[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        
        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costver.length) {
            if (costver[v] <= costHor[h]) { //horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costver[v] * hp);
                vp++;
                v++;
            }

        }
        
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        
        while (v < costver.length) {
            cost += (costver[v] * hp);
            vp++;
            v++;
        }
        
        
        System.out.println("The Minimum cost is "+cost);
    }
}
