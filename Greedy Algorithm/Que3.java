public class Que3 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        char alphabets[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        
        int k = 42;
        int n = 5;
        
        if (k <= 26) {
            int i = 1;
            while (i != n) {
                s.append(alphabets[0]);
                i++;
                k--;
            }
            s.append(alphabets[k-1]);
        } else if (k > 26) {
            int i = 1;
            while (i != n) {
                s.append(alphabets[0]);
                i++;
                k--;
                if (k <= 26) {
                    while (i != n) {
                        s.append(alphabets[0]);
                        i++;
                        k--;
                    }
                    s.append(alphabets[k-1]);
                }
            }
        }
        System.out.println(s.toString());
    }
} // not completed the problem