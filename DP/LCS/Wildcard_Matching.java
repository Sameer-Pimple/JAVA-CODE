package LCS;
/*
Given a text and a wildcard pattern , implement wildcard pattern matching algorithm that finds if wildcard
pattern is matched with text . The matching should cover the enntire text . The wildcard pattern can include the charactors '?' and '*'
 '?' - matches any single charactor
 '*' - Matches any sequence of charactor (including the empty sequence)

 */
public class Wildcard_Matching {
    public static boolean isMatching(String s, String p){
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1]; //In JAVA boolean Array By Defaulte Initialized with FALSE...

        //Initializastion
        dp[0][0] = true;

        for (int i = 1; i < n+1; i++) {
            dp[i][0] = false; //here if p=0 then there is no matching so it will False...
        }
        for(int j=1; j< m+1; j++){
            if (p.charAt(j - 1) == '*') { // here if p ke 0th idx pe true
                dp[0][j] = dp[0][j - 1];
            } 
            else if (p.charAt(j - 1) == '?') { // here if p ke ith idx pe ? hao to agar pehel kuch tha s me tho false vrna nahi hoaga to agle ne jo return kiya tha vahi
                dp[0][j] = dp[0][j - 1];
            }
            else{
                dp[0][j] = false; // here if p ke ith idx pe *&? ye nahi to dusra or kuch nahi letter hi hoaga so set here false 
            }
        }

        // Top-Down
        for(int i = 1; i < n+1 ; i++){
            for(int j = 1; j < m+1; j++){
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {//Here we combine 2 cases(for equle charactor & for '?')
                    dp[i][j] = dp[i-1][j-1];
                }
                else if (p.charAt(j-1) == '*') { //Here is a condition for '*'
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
                else{
                    dp[i][j] = false; // Here if charactor is diff then set false
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        String s = "abc";
        String p = "**";
        System.out.println(isMatching(s, p));
    }
}
