public class Que3 {
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

    public static Node deleteleaf(Node root, int x) {
        if (root == null) {
            return null;
        }

        // If the current node becomes a leaf and its value is x, delete it
        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }
        // Recursively call for left and right subtrees
        root.left = deleteleaf(root.left, x);
        root.right = deleteleaf(root.right, x);


        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        deleteleaf(root, 3);
        Inorder(root);

    }
}
