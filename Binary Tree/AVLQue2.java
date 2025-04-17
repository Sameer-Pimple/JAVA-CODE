public class AVLQue2 {
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

    public static int ClosestElement(Node root, int k) {
        //base case
        if (root == null) {
            return 0;
        }

        if (k == root.data) {
            return root.data;
        }
        
        if (k < root.data  && root.left !=null) {
            if (k <= root.left.data) {
                int diffpre =  root.data -k;
                int diffnext =k- root.right.data;
                if (diffpre > diffnext) {
                    return root.right.data;
                } 
            }
            return ClosestElement(root.left, k);

        } 
        else if (k > root.data && root.right !=null) {
            if (k < root.right.data) {
                int diffpre = k - root.data;
                int diffnext = root.right.data-k;
                if (diffpre > diffnext) {
                    return root.right.data;
                }
            }
            return ClosestElement(root.right, k);
        } 
         else {
            return root.data;
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

        System.out.println(ClosestElement(root, 10));
    }
}
