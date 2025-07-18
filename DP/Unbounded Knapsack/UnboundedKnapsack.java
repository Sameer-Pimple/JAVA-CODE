public class UnboundedKnapsack{ // ye Unbounded Knapsaack me ham apni ak hi value ko bar bar dal sakte hai...0-1 knapsack me nahi kar sakte 1 value 
    public static int Knapsack(int val[], int wt[], int W){

        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0 ; j<dp[0].length; j++){
            dp[0][j] = 0;
        }

        for (int i = 1; i < n+1; i++) {
            for(int j =1; j < W+1; j++){
            
                if (wt[i-1] <= j ) { // ye 2nd loop me hai i=1 , j=2
                    dp[i][j] = Math.max(val[i-1]+dp[i][j - wt[i-1]], dp[i-1][j]); // bhai ye line jaldi samaj nahi aati dyan se sun ... jaise ye array{2,3,10} & capacity bag ki 3 hai isme case1. agar humne bag me 2 ko dala and case2. 2 ko na dalke next ke kiye pass kr diya ab kya hoga next loop me case1 me 2+3=5  jo ki 3 se bada hai to koi kam ka nahi par 3 se condition set ho jati... 
                }                      // 2    +  0 , 0 ;
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(Knapsack(val, wt, W));
    }
} 