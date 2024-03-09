import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter First value :");
        int A = sc.nextInt();
        System.out.print("Enter Second value :");
        int B = sc.nextInt();
        System.out.print("Enter charactor :");
        char C = sc.next().charAt(0);


        switch (C){
            case '+' : System.out.println("Ans :" + (A+B));
                    break;
            case '-' : System.out.println("Ans :" + (A-B));
                    break;
            case '*' : System.out.println("Ans :" + (A*B));
                break;
            case '/' : System.out.println("Ans :" + (A/B));
                break;
            case '%' : System.out.println("Ans :" + (A%B));
                break;
             
        }
        sc.close();

        



       
    }
} 