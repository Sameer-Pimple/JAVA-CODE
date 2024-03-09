public class SpiralMatric {

    public static void Spiral(int matrix[][]){
        int StartingRow = 0;
        int StartingCol = 0;
        int lastrow = matrix.length-1;
        int lastcol = matrix[0].length-1; 

        while (StartingRow<=lastrow && StartingCol<=lastcol) {
            // top
            for(int j=StartingCol ; j<=lastcol; j++){
                System.out.print(matrix[StartingRow][j]+" ");
            }
            // right
            for(int i=StartingRow+1; i<=lastrow; i++){
                System.out.print(matrix[i][lastcol ]+" ");
            }
            // bottom
            for(int k=lastcol-1; k>=StartingCol; k--){
               if (StartingRow==lastrow) {
                break;
               }
                System.out.print(matrix[lastrow][k]+" ");
            }
            // left
            for(int l=lastrow-1; l>=StartingRow+1; l--){
                if (StartingCol==lastcol) {
                    break;
                }
                System.out.print(matrix[l][StartingCol]+" ");
            }
            StartingCol++;
            StartingRow++;
            lastcol--;
            lastrow--;
            
        }
        System.out.println();

    }
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        Spiral(matrix);

    }
}
 