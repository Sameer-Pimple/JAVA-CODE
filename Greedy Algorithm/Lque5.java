import java.util.*;

public class Lque5 {
    public static void main(String[] args){
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(coins ,Comparator.reverseOrder());
        int amount = 1473;
        int Notes = 0;
        
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    Notes++;
                    list.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Number of Cash Used =" + Notes);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
      
    }  
}
