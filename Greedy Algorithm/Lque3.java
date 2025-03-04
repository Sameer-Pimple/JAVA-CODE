import java.util.Arrays;

public class Lque3 {
    public static void main(String args[]) {

        int a[] = { 4, 1, 8, 7 };
        int b[] = { 2, 3, 6, 5 };

        Arrays.sort(a);
        Arrays.sort(b);
        int Minivalue = 0;

        for (int i = 0; i < a.length; i++) {
            Minivalue += Math.abs(a[i] - b[i]);//why we use math.abs function
        }
        System.out.println("Minimum value =" + Minivalue);
    }
}
