import java.util.Stack;

public class StackL6 {

    public static boolean validString(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // opening Bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            // Closing Bracket
            else {
                if (!s.isEmpty() &&
                        ch == ')' && s.peek() == '(' ||
                        ch == '}' && s.peek() == '{' ||
                        ch == ']' && s.peek() == '[') {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "()){}";
        System.out.print(validString(str));
    }
}
