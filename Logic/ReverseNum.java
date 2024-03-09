package Logic;
import java.util.Scanner;

public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number :");
        int value = sc.nextInt();
        
        while(value>0){
            int remainder = value % 10;
            
            value = value / 10;
            System.out.print(remainder);
            
        }sc.close();
    }
}