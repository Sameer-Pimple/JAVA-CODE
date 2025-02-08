public class Que3 {
    public static int LengthString(String str){
        if (str.length() == 0) {
            return 0;
        }
        return LengthString(str.substring(1))+1;
    }
    public static void main(String args[]) {
        String str = "abcdefg";
        System.out.println(LengthString(str));
    }
}
  