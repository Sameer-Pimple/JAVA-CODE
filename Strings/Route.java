package Strings;

public class Route {

    public static double Getpath(String path){
        int X=0, Y=0;

        for(int i=0; i<path.length(); i++){
            char dir=path.charAt(i);

            // WEST
            if (dir=='W') {
                X--;
            }
            // EAST
            else if (dir=='E') {
                X++;
            }
            // NORTH
            else if (dir=='N') {
                Y++;
            }
            // SOUTH
            else{
                Y--;
            }
        }
        int X2=X*X;
        int Y2=Y*Y;
        return Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(Getpath(path));
    }
}
