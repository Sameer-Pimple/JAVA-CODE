// findng the length of an tree..
public class Lque1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int maxlength = 0;
    public static int Treelength(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Treelength(root.left);
        int rh = Treelength(root.right);
        return Math.max(lh, rh)+1;
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   / \
            4    5  6  7
        
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(Treelength(root));
        
    }
}
