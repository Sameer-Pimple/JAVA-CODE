public class BST2 { //Binary Search tree
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            //and Node left and right is by deafalut null so we no to declear
        }
        
        
    }

    public static boolean Searchkey(Node root, int key) { // Remember the Time Complexity of BST is n(H) Height
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data  > key) {
            return Searchkey(root.left, key);
        } else {
            return Searchkey(root.right, key);
        }
      
    }
    public static void main(String args[]) {
        Node root = new Node(8);
        root.left = new Node(5); 
        root.right = new Node(10);
        root.left.left= new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        if (Searchkey(root, 1)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Key Not Found");
        }
        
    }
}
