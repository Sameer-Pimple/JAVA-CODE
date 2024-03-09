public class tempCodeRunnerFile {

    public static void main(String[] args) {
        
        for(int i=1 ; i<=3 ; i++){
            // Space
            for(int s=3; s>=i; s--){
                System.out.print(" ");
            }
            for(int t=1 ; t<=i; t++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2 ; i<=3 ; i++){
            // Space
            for(int s=1; s<=i; s++){
                System.out.print(" ");
            }
            for(int t=3 ; t>=i; t--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}