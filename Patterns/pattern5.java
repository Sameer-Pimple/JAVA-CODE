
// always close the function insid the class

public class pattern5{
    public static void hollow_rectangle( int totrow ,int totcols ){ 
    for(int i=1; i<=totcols; i++){
        for(int j=1; j<=totrow; j++){
            if(i ==1 || i ==totcols || j ==1 ||j ==totrow){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
           }
         System.out.println();

    }
    }

public static void main(String args[]){
    hollow_rectangle(4,5);
}

}