public class AVLBSTTree {


    public static class Node {
        int data, height;
        Node left, right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    
    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }


    public static int getbalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }


    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        //Rotate using 3 Node

        y.left = x;
        x.right = T2;

        //Update Heights

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node RightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotate using 3 Node

        x.right = y;
        y.left = T2;

        // Update Heights

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // x is new root
        return x;
    }
    

    public static Node Insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
           root.left = Insert(root.left, key);
        } else if (key > root.data) {
            root.right =Insert(root.right, key);
        } else {
            return root; // Duplicate Keys Not Allowed
        }
        // Updating the root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        //Calculating BF for root
        int bf = getbalance(root);

        //Left Left Case)
        if (bf > 1 && key < root.left.data) {
            return RightRotate(root);
        }

        // Right Right
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        //left Right 
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return RightRotate(root);
        }

        //Right Left
        if (bf < -1 && key < root.right.data) {
            root.right = RightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void main(String[] args) {
        root = Insert(root, 10);
        root = Insert(root, 20);
        root = Insert(root, 30);
        root = Insert(root, 40);
        root = Insert(root, 50);
        root = Insert(root, 25);


        Preorder(root);
        /*
                30
               /  \
             20    40
             / \     \
            10 25    50

         */
    }
}
