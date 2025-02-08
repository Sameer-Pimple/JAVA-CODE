public class Que2 {

    static String arr[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    
    public static void wordnum(int key) {

        if (key == 0) {
            return;
        }
        
        int lastdigit = key % 10; //collect the last digit i.e. 4
        wordnum(key / 10);        //Remove the last digit in no.
        System.out.print(arr[lastdigit]+" ");
    }
    public static void main(String args[]) {
        wordnum(1234);
    }
}