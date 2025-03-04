import java.util.Arrays;
import java.util.Comparator;

public class Lque4 {
    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
       
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int ans = 1;
        int lastnum = pair[0][1];

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0]>lastnum) {
                ans++;
                lastnum = pair[i][1];
            } 
        }
        System.out.println(ans);
    }
}
