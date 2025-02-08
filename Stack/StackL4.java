import java.util.Stack;

public class StackL4 {

    public static void Stockspan(int Stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < Stock.length; i++) {
            int currstock = Stock[i];

            while (!s.isEmpty() && currstock > Stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int Stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[Stock.length];

        Stockspan(Stock, span);

        for (int i = 0; i < Stock.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}