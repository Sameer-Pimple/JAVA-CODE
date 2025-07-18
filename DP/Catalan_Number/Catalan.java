package Catalan_Number;
public class Catalan {

    public static int CatalanCalculater(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;

        for(int i = 0; i < n; i++){
            // Caatalan Number (C(n)) = sum of C(i) * C(n - 1 - i), for i = 0 to n-1
            ans += CatalanCalculater(i) * CatalanCalculater(n-i-1);
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(CatalanCalculater(4));
    }    
}
