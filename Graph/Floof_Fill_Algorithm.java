public class Floof_Fill_Algorithm {
    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        image[sr][sc] = color; // ye line honi chahiye
        vis[sr][sc] = true; // aur ye bhi

        //left
        helper(image, sr, sc - 1, color, vis, orgCol);
        //right
        helper(image, sr, sc + 1, color, vis, orgCol);
        //up
        helper(image, sr - 1, sc, color, vis, orgCol);
        //down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public static int[][] floodfill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        int image[][] ={{ 1, 1, 1 },
                        { 1, 1, 0 },
                        { 1, 0, 1 }};
        int result[][] = floodfill(image, 1, 1, 2);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
                        
    }
}
