package Arrays;
public class ArrayQUE5 {
    public static void Pair(int nums[]){
        int n=nums.length;
        // int pairs[]=new int[n];
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                for(int k=2; k<n; k++){
                    if(nums[i]+nums[j]+nums[k]==0) {
                        System.out.println("Pairs : "+nums[i]+","+nums[j]+","+nums[k]);
                        
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        Pair(nums);
    }
}
