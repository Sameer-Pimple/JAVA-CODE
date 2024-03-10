package Strings;

public class Compression {
    public static void main(String[] args) {
       String str="aaabbcccdde"; 
        StringBuilder sb= new StringBuilder(" ");
        
       for(int i=0; i<str.length();i++){
        Integer count =1;
        while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
            i++;
            count++;
        }
        sb.append(str.charAt(i));
        if (count>1) {
            sb.append(count);
        }

       }
       System.out.println(sb);
    }
    
}
