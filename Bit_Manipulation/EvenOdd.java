package Bit_Manipulation;

public class EvenOdd {

    public static void Evenodd(int n){
        int Bitmask=1;
        if ((n & Bitmask)==0) {
            System.out.println("number is Even.");
        }else{
            System.out.println("number is ODD.");
        }
    }
    public static void main(String[] args) {
        Evenodd(4);
    }
}
