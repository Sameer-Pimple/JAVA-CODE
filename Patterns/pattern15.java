public class pattern15 {
    public static void main(String args[]){
        int n = 9;
        for(int i =1; i<=n; i++){
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Number Asending
            for(int a=i; a>=1; a--){
                System.out.print(a);
            }
            //Number Desending
            for(int d=2; d<=i; d++){
                System.out.print(d);
            }
             System.out.println();
        }

    }
}


