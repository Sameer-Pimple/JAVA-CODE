import java.util.*;

class TWODArrays{

    public static void search(int key,int matrix[][]) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==key) {
                    System.out.println("Key Found At " + i + "," + j);
                    
                }
                
            }

        }


    }
    public static void main (String args[]){
        int key=9;
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        Scanner sc =new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        sc.close();
        search(key , matrix);
        
    }

}