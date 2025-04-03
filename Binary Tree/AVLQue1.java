public class AVLQue1 {
 
// IN BST We Always Need to Create Node Class Becaused Java does not provide any predfined class for Node in tree.
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = right = null;
        }
    }
    
    public static int RangeSum(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.data >=L && root.data <=R) {
            return root.data + (RangeSum(root.left, L, R) + RangeSum(root.right, L, R));
        }if (root.data < L) {
            return RangeSum(root.right, L, R);
        } else {
            return RangeSum(root.left, L, R);
        }
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

        System.out.println(RangeSum(root, 6, 11) );
    }
}
