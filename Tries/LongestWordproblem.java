public class LongestWordproblem {
    public static class Node {     
        public Node children[];
        public boolean eow;

        //java automatically create a condtructor Node() but if we want to give prametres then we can create...
        public Node() {
            this.children = new Node[26];
            this.eow = false;
        }
    }

    public static Node root = new Node();

    public static void Insert(String words) {
        Node curr = root;
        for (int i = 0; i < words.length(); i++) {

            int idx = words.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    public static boolean Search(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[i];
        }
        return true;
    }

    public static String ans = "";

    public static void LongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {  
            if (root.children[i] != null && root.children[i].eow == true) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                LongestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String args[]) {
        String words[] = { "w", "wo", "wor", "worl", "world" };
        for (int i = 0; i < words.length; i++) {
           Insert(words[i]);
        }
        LongestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
