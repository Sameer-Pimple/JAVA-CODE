public class CoinChange {
    public static int Coin_Change(int coins[] , int sum){

        int n = coins.length;
        int dp[][] = new int[coins.length+1][sum+1];

        //Initialization
        for(int i= 0 ; i<coins.length +1; i++){
            dp[i][0] = 1;

        }
        for (int j = 1; j < sum+1; j++) {
            dp[0][j] = 0;
        }

        //logic Tabulization
        for (int i = 1; i < n+1; i++) {
            for(int j = 1; j < sum+1; j++){
              int ith =  coins[i-1] ;
                if (ith <= j) {
                    dp[i][j]=  dp[i][j - coins[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];


    }
    public static void main(String[] args) {
        int coins[] = {2,5,3,6};
        int sum = 10;
        System.out.println(Coin_Change(coins, sum));
    }
}
