public class Que2 {
    public static void SumRow(int matrix[][]){
        int sum=0;
        for(int j=0; j<matrix.length; j++){
            sum +=matrix[1][j];
        }
        System.out.println("Sum of 2nd row is "+sum);
    }
    public static void main(String args[]){
        int matrix[][]={{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        SumRow(matrix);
    }
}
