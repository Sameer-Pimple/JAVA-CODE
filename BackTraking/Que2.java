public class Que2 {
    public static void FindSub(String str, String ans, int i) {
        //base class
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        FindSub(str, ans + str.charAt(i), i + 1);
        //No choice
        FindSub(str, ans, i + 1);
    }
    
    public static void main(String args[ ]) {
        String str = "abc";
        FindSub(str, "", 0);
    }
}
  