package Logic;
import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        int a, b, c, Average;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        System.out.print("Enter third number:");
        c=sc.nextInt();
        Average=(a+b+c)/3;
        System.out.print("Average is: "+Average);
        sc.close();

    }
}
