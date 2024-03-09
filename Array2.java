import java.util.*;

public class Array2 {
    public static int linearsearch(int number[],int Key){
        for(int i=0 ; i<number.length; i++){
            if (number[i]==Key) {
                return i;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter The Index You Have To Search : ");
        Scanner sc = new Scanner(System.in);
        int number[]={2,4,6,8,10,12,14,16};
        int Key =sc.nextInt();
        int index =linearsearch(number,Key);
        if (index==-1) {
            System.out.println("Index not found");
        }else{
            System.out.println("Key is At Index = "+ index);
        }
        sc.close();
    }
    
}
