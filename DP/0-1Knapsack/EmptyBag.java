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
    }    /*
    Knapsack matlb 1 bag...and 0-1 Knapsack maatlb include or exclude wala bag...value ko leke aage jayenge ya value ko nhi nahi lenge
    Knapsack me Meiomizastion matlb jisme Pure Recusrsion use hota hai...calling the function with increamenting the value
    Knapsack me Tabulisation matlb pure for Loop....with 2D Array...just Increasing i++, j++

    */
}
