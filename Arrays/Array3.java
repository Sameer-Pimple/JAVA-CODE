package Arrays;
// import java.util.*;
public class Array3 {
    public static int getlargest(int number[]){

        // int Largest = Integer.MIN_VALUE; for +infinity
        // int small = Integer.MAX_VALUE;   for -infinity 

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
            for(int i=0; i<number.length; i++){
                if(largest<number[i]){
                    largest=number[i];
                }
                if (smallest>number[i]) {
                    smallest=number[i];
                    
                }
            }
            System.out.println("The Smallest Number is : " + smallest );
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,6,3,5,4};
        System.out.println("The Largest Number is : "+ getlargest(number));
    }
}
