import java.util.Scanner;
public class calculatebillGST{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the price of Pen:");
        float pen=sc.nextFloat();
        System.out.print("Enter the price of Pensil:");
        float pencil=sc.nextFloat();
        System.out.print("Enter the price of Eraser:");
        float Eraser=sc.nextFloat();
        float total=pen+pencil+Eraser;
        System.out.println("Total bill with GST:"+(total+total*0.18));
        sc.close();
    }
}