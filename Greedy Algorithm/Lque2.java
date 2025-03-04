import java.util.*;

public class Lque2 {
    public static void main(String args[]) {
        int value[] = { 60, 100, 120 };
        int Weight[] = { 10, 20, 30 };
        int W = 50;
        //create array
        double ratio[][] = new double[value.length][2];
        
        for (int i = 0; i <value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] /(double) Weight[i];
        }
        
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        
        int capacity = W;
        int Maxvalue = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0]; //here we given the index of ratio
            if (capacity >= Weight[idx]) {
                Maxvalue += value[idx];
                capacity -= Weight[idx];
            } else {
                Maxvalue +=(ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum value = " + Maxvalue);

    }
}
