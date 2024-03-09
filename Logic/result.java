package Logic;
import java.util.Scanner;

public class result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Marks :");
        int marks =sc.nextInt();


        String Result=(marks>=33)?"Pass" : "Fail";
        System.out.println(Result);
        sc.close();
         
        
        
    }
}