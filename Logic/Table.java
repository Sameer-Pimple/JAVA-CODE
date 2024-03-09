package Logic;
import java.util.Scanner;

public class Table{
    public static void main(String args[]){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Value :");
              int value = input.nextInt();
              int Table = 0;
            for(int i = 1 ; i< 11; i++){
                Table = value * i;
                System.out.println("Table Created :" + Table);
                
        
            }input.close();
    }
}