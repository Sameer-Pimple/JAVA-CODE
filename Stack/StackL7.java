import java.util.Stack;

public class StackL7 {

    public static boolean DuplicateBracket(String str) {

        Stack<Character> s = new Stack<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            // Opening
            if (ch != ')') {
                s.push(ch);
            } else {
                // Closing
                if (s.peek() == '(') {
                    s.pop();
                } else {
                    while (s.peek() != '(') {
                        s.pop();  
                        count++;
                    }
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            }

        }
        if (s.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a+b)";
        System.out.println(DuplicateBracket(str2));
    }
}
