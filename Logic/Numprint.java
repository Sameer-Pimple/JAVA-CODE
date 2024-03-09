package Logic;
import java.util.Scanner;
public class Numprint{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a =1;
        System.out.print("Enter the value :");
        int value = sc.nextInt();

        while(a<=value){
            System.out.print(a + " ");
            a++;
        }sc.close();
        

    }
}
