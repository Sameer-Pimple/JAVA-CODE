public class Lque4 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    
    public static boolean isSubtree(Node root, Node Subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == Subroot.data) {
            if (isidentical(root, Subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, Subroot) || isSubtree(root.right, Subroot);
    }

    public static boolean isidentical(Node node, Node Subroot) {
        if (node == null && Subroot == null) {
            return true;
        }
        else if (node == null || Subroot == null || node.data != Subroot.data ) {
            return false;
        }
        if (!isidentical(node.left, Subroot.left)) {
            return false;
        }
        if (!isidentical(node.right, Subroot.right)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        /*
                     1
                    / \
                   2   3
                  / \ / \
                 4  5 6  7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        /*
                     2
                    / \
                   4   5

         */

        Node Subroot = new Node(2);
        Subroot.left = new Node(4);
        Subroot.right = new Node(5);

        System.out.println(isSubtree(root, Subroot));

    }
}
