public class Gridways {

    // Using Permitation for minimun=m time complexity
    //formula is (factorial of two number)\factorial of 1st number *factorial of 2nd number 
    /*total ways = (n-1+m-1)!/(n-1!)(m-1!)*/
     

    public static int Ways(int i, int j, int n, int m) {
        //base case
        if (i == n - 1 && j == m - 1) { //condition for last cell
            return 1;
        }else if (i ==n || j ==m) { //boundry cross condition
            return 0;
        }
        //Recrsion
        int w1 = Ways(i+1, j, n, m);
        int w2 = Ways(i, j+1, n, m);
        return w1+w2;
        }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(Ways(0, 0, n, m));
        
    }
}
