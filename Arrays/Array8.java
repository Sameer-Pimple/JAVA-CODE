package Arrays;
public class Array8 {

    public static void Subarray(int number[]){
        for(int i=0;i<=number.length;i++){ //incresing start after box print
            int start =i;
            for(int j=i; j<number.length; j++){ //increasing end
                int end =j;
                for(int k=start; k<=end; k++){ //printing start to end
                    System.out.print(number[k]+" ");               
                }
                System.out.println();
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        Subarray(number);
    }
}
