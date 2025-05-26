
// this is the problem of prefix where we have to convrt word to prefix ....we used modified insert funtionin it where we increase a freqency of letter if it again repeate
public class PREFIX {

    static class Node {
        Node children[];
        int freq;
        boolean eow;

        Node() {
            children = new Node[26];
            freq = 1;
            eow = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String arr) {
        Node curr = root;
        for (int i = 0; i < arr.length(); i++) {

            int idx = arr.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
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

    public static void Prefix(String arr) {

        Node curr = root;
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            int idx = arr.charAt(i) - 'a';
                s1.append(arr.charAt(i));
                if (curr.children[idx].freq == 1) {
                    break;
                }
            curr = curr.children[idx];
        }
        System.out.print(s1.toString() + ", ");
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            Prefix(arr[i]);
        }

    }
}
