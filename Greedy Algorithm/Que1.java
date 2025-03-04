
public class Que1{
    public static void main(String[] args) {
        String word = "LRRRRLLRLLRL";
        int count = 0;
        int freq = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'L') {
                freq++;
            } else {
                freq--;
            }
            if (freq == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}

