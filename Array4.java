import java.util.*;
public class Array4 {
    
    public static int Binarysearch(int number[], int key){
       
        int start =0, end = number.length-1;
        while(start <= end){
            int mid = (start +end)/2;
            if(number[mid] ==key){
                return mid;
            }
            if(number[mid] <key){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.print("Enter The Key You Have To Search : ");
        Scanner sc = new Scanner(System.in);
        int number[]={2,4,6,8,10,12,14,16};
        int Key = sc.nextInt();
        int output = Binarysearch(number, Key);
        if (output==-1) {
            System.out.print("Index Not Found");
        }else{
            System.out.println("The Index Is : "+output);
        }
        sc.close();
    }
}