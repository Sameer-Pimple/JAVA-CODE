package Logic;
import java.util.Scanner;
public class funcode1{
    public static int factorial(int n){
        int f=1;
        for(int i = 1; i<=n; i++){
            f =f*i;
        }return f;
    }

    public static int binomial(int n, int r){
        int nfact =factorial (n);
        int rfact =factorial(r);
        int nr_fact =factorial(n-r);
        int coefficient = nfact / (rfact * nr_fact);
        return coefficient;
    }

    public static void average(int a,int b,int c){
        int avrg= (a+b+c)/3;
        System.out.println("average of three number :" +avrg);
    }

    public static boolean isEven(int n){
         boolean even= false;
        if (n % 2 == 0) {
            even=true;
        }
        return even;   
    }

    public static int Revers(int num){
        int value=num;
        int Revers = 0;
        while(value>0){
         int lastdigit = value % 10;
            Revers = Revers * 10 + lastdigit;
            value = value / 10;
            
        }return Revers;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
            
           System.out.println(Revers(num));
           sc.close();
           
    
    }
}

