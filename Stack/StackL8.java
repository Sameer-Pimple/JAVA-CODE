import java.util.*;

public class StackL8 {

    public static void MaxAreaHisto(int height[]) {
        Stack<Integer> s = new Stack<>();
        int MaxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];

        // Next smallest Right
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next smallest Left
        s = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] =s.peek();
            }
            s.push(i);
        }
        // Area of histogram
        for (int i = 0; i < height.length; i++) {
            int Height = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int Area = Height * width;
            MaxArea = Math.max(MaxArea, Area);
        }
        System.out.println(MaxArea);
        
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        MaxAreaHisto(height);

    }
}
