package Arrays;
public class ArrayQUE4 {

    public static int Trapingwater(int height[]){
        
        int n=height.length;

        //  caluculate Left Max Bound
        int LMB[]=new int[n];
        LMB[0]=height[0];
        for(int i=1; i<n;i++){
            LMB[i]=Math.max(LMB[i-1], height[i]);
        }

        //  caliculate Right max Bound
        int RMB[]=new int [n];
        RMB[n]=height[n];
        for(int i=n-1; i>=0; i--){
            RMB[i]=Math.max(RMB[i+1], height[i]);
        }
        int Trapedwater=0;
       
        // waterlevel
        

        // Trapedwater Loop
        for(int i=0; i<n; i++){
           int Waterlevel =Math.min(RMB[i], LMB[i]);
            Trapedwater+=Waterlevel-height[i];
        }
        return Trapedwater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,3,2,5};
        System.out.println(Trapingwater(height));
    }

}
