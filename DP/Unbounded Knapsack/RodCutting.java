public class RodCutting {
    public static int RodCut(int length[] , int price[], int rodLength){
        // Declearing 
        int P = price.length; 
        int dp[][] = new int [P+1][rodLength+1];

        //Initialisation
        for (int i = 0; i <= P ; i++) {
            for(int j = 0; j <= rodLength; j++){
              dp[i][j] =0;   
            }
        }

        //logic Tabulaization
        for(int i = 1; i< P+1; i++){
            for(int j=0; j< rodLength+1; j++){
                if (length[i-1] <= j) {
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        printdp(dp);
        return dp[P][rodLength];
    }
    
    public static void printdp(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int rodLength = 8;
        System.out.println(RodCut(length, price, rodLength));
    }
}
