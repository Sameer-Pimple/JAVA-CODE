package Bit_Manipulation;

public class Operations{

    
    public static int Getbit(int i, int n){
        int bitmask=1<<i ;
        if((bitmask & n) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }


    public static int Setbit(int i, int n){
        int bitmask = 1<<i;
       return bitmask|n;
    }


    public static int Clearbit(int i,int n){
        int bitmask = ~(1<<i);                   /*Using AND & */
        return bitmask & n;
    }
    // Another Aprroch TO Solve Clearbit Using XOR
    public static int Clearbit1(int i,int n){
        int bitmask = (1<<i);                   /*Using XOR ^ */
        return bitmask ^ n;
    }


    public static int Updatebit(int opr){
        int n =5 , i = 0;
        if (opr ==0) {
            return Clearbit(i, n); //we use Clearbit func to convt ith index to Zero
        }else{
            return Setbit(i, n);//we use Setbit func to convert ith index to One
        }
    }


    public static void main (String args[]){
        // System.out.println(Getbit(3,10));
        // System.out.println(Setbit(2,10));
        // System.out.println(Clearbit(1,10));
        // System.out.println(Clearbit1(1,10));
        // System.out.println(Updatebit(0));
        
    }

}