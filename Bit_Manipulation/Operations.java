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

    public static int Clearlastbit(int n, int i){
        int bitmask = -1<<i; //we can use -1<<i OR ~0<<i
        return bitmask & n;
    }

    public static int ClearbitsInRange(int n, int i, int j){
        int a=(~0)<<j+1;
        int b =(1<<i)-1;
        int bitmask= a|b;
        return n & bitmask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static int CountSetBit(int n){
        int Count=0;
        while (n>0) {
            if ((n&1) !=0) {
                Count ++;
            }
            n = n>>1;
        }
        return Count;
    }


    public static void main (String args[]){
        // System.out.println(Getbit(3,10));
        // System.out.println(Setbit(2,10));
        // System.out.println(Clearbit(1,10));
        // System.out.println(Clearbit1(1,10));
        // System.out.println(Updatebit(0));
        //System.out.println(Clearlastbit(15,2));
        //System.out.println(ClearbitsInRange(10, 2, 4));
        //System.out.println(isPowerOfTwo(15));
        System.out.println(CountSetBit(15));
    }

}