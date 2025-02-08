import java.util.Stack;

public class StackL5 {
    public static void NextGreter(int arr[], int nextgreter[]) {
        int n = arr.length;
        Stack<Integer>s =new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextgreter[i] = -1;
            } else {
                nextgreter[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String args[]) {
        int arr[]={6,8,0,1,3};
         
        int nextgreter[] = new int[arr.length];
        NextGreter(arr, nextgreter);
        
        for (int i = 0; i < nextgreter.length; i++) {
            System.out.print(nextgreter[i] + " ");
        }

    }
}
 
