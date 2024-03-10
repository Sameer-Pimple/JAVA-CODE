package Strings;

public class Palindrome {

    public static boolean PALINDROME(String str){
        for(int i=0; i<str.length()/2; i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="nayan";
        System.out.println(PALINDROME(str));
    }
    
}