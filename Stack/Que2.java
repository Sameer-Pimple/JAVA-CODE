import java.util.*;
public class Que2 {

    public static String simplify(String str) {

        String[] sb = str.split("/");
        Stack<String> s = new Stack<>();

        for (String i : sb) {
            if (i.equals("..") && !s.empty()) {
                s.pop();
            } else if (!i.equals("") && !i.equals(".") && !i.equals("..")) {
                s.push(i);
            }
        }
        
        StringBuilder stb = new StringBuilder();
        
        for (String i : s) {
            stb.append("/");
            stb.append(i);
        }
        return stb.length() == 0 ? "/" : stb.toString();
    }
    public static void main(String[] args) {
        String str = "/a//./b/..";
        System.out.println(simplify(str));
    }
}