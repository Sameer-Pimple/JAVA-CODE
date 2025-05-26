
public class wordBreakproblem {

    static class Node {
        Node children[];
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String words) { // Time Complexity O(L)

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

    public static boolean Search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {

            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;

    }
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (Search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }

        }

        return false;
    }

    public static void main(String args[]) {
        String word[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
