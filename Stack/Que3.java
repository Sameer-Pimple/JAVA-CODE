import java.util.*;
public class Que3 {

    public static String DecodeString(String str){
        Stack<String> text = new Stack<>();
        Stack<Integer> num = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() && str.charAt(i) != ']') {
                if (Character.isDigit(str.charAt(i))) {
                    num.push(Character.getNumericValue(str.charAt(i)));
                } else {
                    text.push(String.valueOf(str.charAt(i)));
                }
                i++;
            }
            StringBuilder dubtext = new StringBuilder();
            StringBuilder dubadd = new StringBuilder();

            while (!text.peek().equals("[")) {
                String curr = text.pop();
                dubtext.insert(0, curr);

            }
            text.pop();
            int mulnum = num.pop();
            dubadd.append(dubtext.toString().repeat(mulnum));
            text.push(dubadd.toString());

        }
        return text.peek();
    }
    public static void main(String[] args) {
        String str = "25[c3[n]v]";
        System.out.println(DecodeString(str));
    }
}
