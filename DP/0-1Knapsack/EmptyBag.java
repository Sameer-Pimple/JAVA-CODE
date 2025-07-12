public class EmptyBag {
    public static int Knapsackbagfill(int[] val , int[] wt , int W , int n){
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n-1]<= W) { // valid
            // include
          int ans1 = val[n-1]+Knapsackbagfill(val, wt, W-wt[n-1], n-1 ); 
            // Exclude
          int ans2 = Knapsackbagfill(val , wt , W , n-1); 
          return Math.max(ans1, ans2);
        }
        else{
           return Knapsackbagfill(val, wt, W, n - 1);
        }
    }
    public static void main(String args[]){
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(Knapsackbagfill(val, wt, W, val.length));
    }    
}
