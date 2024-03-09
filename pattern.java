import java.util.Scanner;
public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int input  = sc.nextInt();
       
        for( int line = 1; line <=input ; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
         sc.close();
    }
}