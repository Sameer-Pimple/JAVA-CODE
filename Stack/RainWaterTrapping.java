import java.util.Stack;

public class RainWaterTrapping {
    public static int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        Stack<Integer> stack = new Stack<>();
        int trappedWater = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop(); // Get the top element

                if (stack.isEmpty())
                    break; // No left boundary

                int left = stack.peek(); // Left boundary
                int width = i - left - 1; // Distance between boundaries
                int waterHeight = Math.min(height[i], height[left]) - height[top];

                trappedWater += width * waterHeight;
            }
            stack.push(i);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 6 };
        System.out.println("Trapped Water: " + trap(height)); // Output: 6
    }
}
