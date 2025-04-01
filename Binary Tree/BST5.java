
public class BST5 {
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

    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int MaxBST = 0;
      
    public static Info LargestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = LargestBST(root.left);
        Info rightInfo = LargestBST(root.right);
        int size = (leftInfo.size + rightInfo.size) + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max= Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        
        // Collecting Minimum Value...
        // Collecting Maximum Value...
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        //For Cheacking IsBST...
        if (leftInfo.isBST && rightInfo.isBST) {
            MaxBST = Math.max(MaxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(true, size, min, max);
    }
    
    
     public static void main(String args[]) {
        
    /*
             8
          /     \
        6        10         
       /           \
      5             11
     /               \
    3                12
         
    */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = LargestBST(root);
        System.out.println("Largest BST Size = " + MaxBST);
    }
}
