

public class LBSTQue {
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

    public static Node Insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }
        return root;
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        //For Right
        if (max != null && root.data >= max.data) {
            return false;
        }
        //For Left
        else if (min != null && root.data <= min.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
      public static void Mirror(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right !=null) {
            
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    
    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        int value[] = {8,5,3,6,10,11};   
        Node root = null;
        /*
                8
              /   \
            5      10
           / \      \
          3   6      11g 
         */
        for (int i = 0; i < value.length; i++) {
            root = Insert(root, value[i]);
        }
        Inorder(root);
        System.out.println();
        Mirror(root);
        Inorder(root);
    }
}
 