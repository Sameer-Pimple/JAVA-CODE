public class pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k<=i; k++){
            System.out.print(count +" ");
            }
            count++;
            System.out.println();
        }
    }
}
