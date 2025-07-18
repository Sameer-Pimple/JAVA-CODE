package LCS;

//This is the Que of Longest Common Subsequence this que is solve using DP (Tabulisation).
public class Que1Tabli {

    public static int Subsquence(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        //initialization
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = 0;
        }
        //logic
        for(int i = 1; i<n+1; i++){
            for(int j = 1; j < m+1; j++){
                //valid
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    int ans1 = dp[i-1][j]; //up cell
                    int ans2 = dp[i][j-1]; //left cell
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String args[]){
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(Subsquence(str1, str2));
    }
}
