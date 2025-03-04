public class Que4 {
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 1, 40 };
        
        int buy = price[0];
        int maxprofit = 0;

        for (int i = 1; i < price.length; i++) {
            if (buy > price[i]) {
                buy = price[i];
            } else if(price[i] - buy > maxprofit) {
                maxprofit = price[i] - buy;
            }
        }
        System.out.println(maxprofit);
        
    }
}
