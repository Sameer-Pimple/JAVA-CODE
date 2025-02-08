import java.util.*;

public class Rainwater {
    
    public static int StoreWater(ArrayList<Integer> Height) { //Bruteforece Method having O(n^2)
        int maxwater = 0;
        for (int i = 0; i < Height.size(); i++) {
            for (int j = i + 1; j < Height.size(); j++) {
                int height = Math.min(Height.get(i), Height.get(j));
                int width = j - i;
                int Curretwater = height * width;
                if (Curretwater > maxwater) {
                    maxwater = Curretwater;
                }
            }
        }
        return maxwater;
    }
    
    public static int StoreWater2(ArrayList<Integer> Height) { //Two Pointer Method Having O(n)
        int maxwater = 0;
        int lp = 0;
        int rp = Height.size() - 1;

        while (lp < rp) {
            int width = rp - lp;
            int height = Math.min(Height.get(rp), Height.get(lp));
            int Curretwater = height * width;
            if (Curretwater > maxwater) {
                maxwater = Curretwater;
            }
            if (Height.get(rp) >= Height.get(lp)) {
                lp++;
            } else {
                rp--;
            }
            
        }
        return maxwater;
    }
    
    public static void main(String args[]) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println(StoreWater(Height));
        System.out.println(StoreWater2(Height));
    }
}
