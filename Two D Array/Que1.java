public class Que1 {
    public static void Seven(int key,int matrix[][]){
        int count= 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println("Number of "+ key + " repeat is " + count);
    }


    public static void main(String args[]){
        int key=7;
        
        int matrix[][]={{4,7,8},
                        {8,8,7}};
                        Seven(key, matrix);
    }
}