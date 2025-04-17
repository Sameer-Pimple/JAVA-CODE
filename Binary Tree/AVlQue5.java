public class AVlQue5 {

    //Node Class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int maxSum = 0;

    static class Info {
        boolean isBST;
        int min, max, sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public static Info maxSumBST(Node root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info left = maxSumBST(root.left);
        Info right = maxSumBST(root.right);

        // Check if current tree is BST
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            int currSum = root.data + left.sum + right.sum;
            maxSum = Math.max(maxSum, currSum);
            return new Info(true, Math.min(root.data, left.min), Math.max(root.data, right.max), currSum);
        } 
        else {
            return new Info(false, 0, 0, 0);
        }
    }

    public static void main(String args[]) {
        Node root = new Node(5);
        root.left = new Node(9);
        root.right = new Node(2);
        root.left.left = new Node(6);
        root.left.right = new Node(3);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);

        maxSumBST(root);
        System.out.println("Maximum Sum of BST Subtree: " + maxSum);

    /*
             5
           /   \
          9    2
         / \
        6   3
       / \
      8   7
     
     */
    }
}
