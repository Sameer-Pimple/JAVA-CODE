public class Gridways2 {

    public static int Factorial(int num) {
        if (num ==0 ) {
            return 1;
        }
        int fn = num * Factorial(num - 1);
        return fn;
    }
    
    public static int Gridwaysbypermitation(int n, int m) {
        int factU = Factorial(n-1+m-1);
        int factD = Factorial(n-1) * Factorial(m-1);
        return factU/factD;
    }
    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("Total Number If Ways = "+Gridwaysbypermitation(n , m));
        

    }
}
