public class pattern12 {
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i<= n; i++){
            //spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //star
            for(int t = 1;t<=n;t++){
                if(i == 1 || i ==n || t ==1 || t ==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
