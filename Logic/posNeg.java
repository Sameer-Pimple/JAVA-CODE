package Logic;
import java.util.*;

public class posNeg{
    public static void main(String args[]){
    Scanner number = new Scanner(System.in);
    int a = number.nextInt();
    if (a>=0){
        System.out.println("positive");    
    }
    else
    System.out.println("negative");
    number.close();

    }
}