package Fibonacci;
import java.util.*;


public class Fib {

    public static int Fib_Memoisation(int n, int f[]) {  // Memoisation is a pattern or a techniqe where we can save the calculate data to save the recalsulation time and use recursion
        if (n == 0 || n == 1) {
            return n;

        }
        if (f[n] != 0) {
            return f[n];
        }

        f[n] = Fib_Memoisation(n - 1, f) + Fib_Memoisation(n - 2, f);
        System.out.print(f[n]+" ");
        return f[n];
    }
      
    
    public static int FibTabulation(int n, int f[]) { //Tabulation is a pattern where we use loop insted of recursion
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Fibonacci Level: ");
        int n = sc.nextInt();
        int f[] = new int[n + 1];
        System.out.println("The " + n + "th level is " + Fib_Memoisation(n, f)+" From Memoisation");
        System.out.println("The " + n + "th level is " + FibTabulation(n, f)+" From Memoisation");
        sc.close();
        
    }
}
 