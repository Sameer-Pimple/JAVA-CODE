package LCS;
import java.util.*;
//in this Que we have to find the Incresing sequence 
public class Que3 {

    //This is the main function... 
    public static int longest_increasing_subsequence(int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()];
        int i= 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);//assending
        return lcs(arr1,arr2);
    }
    // This is a Helper Function which is used to calculate the Longest common subsequence...
    public static int lcs(int arr1[], int arr2[]){
        int n= arr1.length;
        int m = arr2.length;
        int dp[][]= new int[n+1][m+1];
        int count = 0;

        // we have to use Tabulization method so we have to Initialised... 
        for(int i = 0; i<=n; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j <= m; j++){
            dp[0][j] = 0;
        }

        //so now we have to use mai logic Top-down method..
        for(int i=1; i<=n; i++){
            for(int j=1; j <=m; j++ ){
                if (arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    
                }
                else{
                    int ans1 = dp[i-1][j]; // yaha par ye loacte kar raha hai up side cell
                    int ans2 = dp[i][j-1];// yaha par ye loacte kar raha hai left side cell
                    dp[i][j] = Math.max(ans1,ans2);
                }
            }
        }
        printdp(dp);
        return dp[n][m];
    }
    //here i want to check how table look
    public static void printdp(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[] = {50,3,10,7,40,80};
        System.out.println(longest_increasing_subsequence(arr));
    }
}
