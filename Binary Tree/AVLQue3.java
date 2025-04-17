public class AVLQue3 {
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

    static int count = 0;
    public static Node kthsmallestelement(Node root, int k) {
        if (root == null) {
            return null;
        }
        Node right = kthsmallestelement(root.right, k);
        if (right != null) {
            return right;
        }
        count ++;

        if (count == k) {
            return root;
        }
        return kthsmallestelement(root.left, k);
       
        
    }
    public static void main(String args[]) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        /*
              8
             / \
            5   11
           / \   \
          3   6   20
             
         */
        System.out.println(kthsmallestelement(root, 5).data);
    }
}
 