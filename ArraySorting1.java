public class ArraySorting1 {


    public static void BubbleSort(int nums[]){
        int n=nums.length;
        for(int turn=0; turn<n; turn++){
            for(int i=0; i<n-1; i++){
                if (nums[i+1]<=nums[i]) {
                    int temp = nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    
                }
            }
        }
        
    }


    public static void SelectionSort(int nums[]){
        int n=nums.length;
        // sorted array loop
        for(int i=0; i<n-1; i++){
            int samllest= i;
            // unsorted array loop
            for(int j=i+1; j<n; j++){
                if (nums[samllest]>nums[j]) {
                    samllest = j;
                }
            }
                int temp =nums[samllest];
                nums[samllest]= nums[i];
                nums[i]=temp;
        }
    }


    public static void Insertsort(int num[]){
        for(int i=1; i<num.length; i++){
            int current = num[i];
            int prev = i-1;
            while (prev>=0&&num[prev]>current ) {
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=current;
        }
    }


    public static void printarr(int num[]){
       for(int i=0;i<num.length;i++){
         System.out.print(num[i]+" ");
       }
    }
    public static void main(String[] args) {
        int nums[]={3,6,2,1,8,7,4,5,3,1};
        int num[]={5,4,1,3,2};
    //BubbleSort(nums);
    SelectionSort(nums);
    Insertsort(num);
       printarr(num);
    }
}
