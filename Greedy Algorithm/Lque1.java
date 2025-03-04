import java.util.*;

public class Lque1 {

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int Activity[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }

        Arrays.sort(Activity, Comparator.comparingDouble(o -> o[2]));

        int Maxacti = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // First Activity
        Maxacti = 1;
        list.add(Activity[0][0]);
        int lastend = Activity[0][2];

        for (int i = 0; i < end.length; i++) {
            if (Activity[i][1] >= lastend) {
                Maxacti++;
                list.add(Activity[i][0]);
                lastend = Activity[i][2];
            }
        }
        System.out.println("Maxi Activity = " + Maxacti);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("A" + list.get(i) + ",");
        }
    }
}