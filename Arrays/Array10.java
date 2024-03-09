package Arrays;
public class Array10 {

    public static int Trapingwater( int height[]){

        int n = height.length;
        // Left Max bound
        int LeftMaxbound[]=new int [n];
        LeftMaxbound[0]=height[0];
        for(int i=1; i<n; i++){
            LeftMaxbound[i]=Math.max(height[i], LeftMaxbound[i-1]);
        }

        // Right max bound
        int RightMaxbound[]=new int[n];
        RightMaxbound[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            RightMaxbound[i]=Math.max(height[i],RightMaxbound[i+1]);
        }
        // LOOP
        int Trapedwater=0;
        for(int i=0; i<n; i++){
            int waterlevel=Math.min(LeftMaxbound[i], RightMaxbound[i]);
            Trapedwater+=waterlevel-height[i];
        }
        return Trapedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(Trapingwater(height));
    }
}
