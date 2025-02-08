public class Sudoku {
    public static boolean issafe(int Sudoku[][], int row, int col, int digit) {
        // row
        for (int i = 0; i <= 8; i++) {
            if (Sudoku[i][col] == digit) {
                return false;
            }
        }
        // column
        for (int j = 0; j <= 8; j++) {
            if (Sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3; // Remember this to calculate grid Stating index
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (Sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void PrintGrid(int Sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(Sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean sudokusolver(int Sudoku[][], int row, int col) {
        //base case
        if (row == 9) {
            return true;
        } 
        //recursion
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (Sudoku[row][col]!= 0) {
            return sudokusolver(Sudoku, nextrow, nextcol);
        }
        for (int digit = 1; digit <=9; digit++) {
            if (issafe(Sudoku, row, col, digit)) {
                Sudoku[row][col] = digit;
                if (sudokusolver(Sudoku, nextrow, nextcol)) {
                    return true;
                }
                Sudoku[row][col]=0;
            }
        }
        return false;
    }
    
    
    
    public static void main(String args[]){
        int Sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3} };
            
        if (sudokusolver(Sudoku, 0, 0)) {
            System.out.println("Solution Exitst");
            PrintGrid(Sudoku);
        } else {
            System.out.println("Solution Does not exist");
       }
       
    }
    
}
