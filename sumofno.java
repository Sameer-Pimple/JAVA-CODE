import java.util.Scanner;
public class sumofno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :");
        int n =sc.nextInt();
        int i =1;
        int sum =0;
        while(i<=n ){
            sum =sum + i;
            i++;
        }System.out.println("Total sum of number :" + sum);
        sc.close();
    }
} 