public class Array9 {

    public static void Maxsubarrausum(int number[]){
         int max = 0;
        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                int current =0;
                    for(int k=start; k<=end ; k++){
                        current+=number[k];
                    }
                    System.out.println(current);
                        if (current>max) {
                            max = current;
                        }
            }
        }
        System.out.println("The Maximun sum is : "+max);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        Maxsubarrausum(number);
    }
}