package LCS;
// //This is the Que of Longest Common Subsequence this que is solve using tabulizastion.
// here we have to find the continueous max substring length.
public class Que2Tabul {
    public static int continueSubstring(String str1, String str2){
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int count = 0;

        //initialiaztion
        for(int i = 0 ; i <= n; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = 0;          
        }

        // filing top down
        for (int i = 1; i < n+1; i++) {
            for(int j = 1 ; j < m+1; j++){
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    count = Math.max(count, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        System.out.println(continueSubstring(str1,str2));
    }
}
