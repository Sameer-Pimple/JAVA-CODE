public class SampleQue1 {

    public static boolean solvemaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];
        if (solvemazeuntil(maze, 0, 0, sol) == false) {
            System.out.println("Solution Does not exist");
            return false;
        }
        PrintMaze(sol);
        return true;
       
    }



    public static boolean solvemazeuntil(int maze[][], int x, int y, int sol[][]) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && x <= maze.length - 1 && y >= 0 && y <= maze.length - 1 && maze[x][y] == 1) {
            if (sol[x][y] == 1) {
                return false;

            }
            sol[x][y] = 1;
            if (solvemazeuntil(maze, x + 1, y, sol)) {
                if (sol[x][y] == 1) {
                    return true;
                }
                sol[x][y] = 1;
            }
            if (solvemazeuntil(maze, x, y + 1, sol)) {
                if (sol[x][y] == 1) {
                    return true;
                }
                sol[x][y] = 1;
            }
        }

        return false;
    }
    
    

    public static void PrintMaze(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int maze[][]={
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1} };
        solvemaze(maze);
    }
}