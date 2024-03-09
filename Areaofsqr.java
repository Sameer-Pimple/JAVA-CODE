import java.util.Scanner;
public class Areaofsqr
{
   public static void main(String[] args) 
   {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter A number: ");
        int side = scan.nextInt();
       
        System.out.println("The area of sqaure is "+(side*side));
        scan.close();
   }
}
