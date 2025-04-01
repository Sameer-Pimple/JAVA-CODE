import java.util.*;

public class BST3 {
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

    public static Node BalenceBST(int st, int end, int value[]) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(value[mid]);
        root.left = BalenceBST(st, mid - 1, value);
        root.right = BalenceBST(mid + 1, end, value);
        return root;
    }

    public static Node Preorder(Node root) {
        if (root == null) {
            return null;
        }
        System.out.print(root.data+" "); 
        Preorder(root.left);
        Preorder(root.right);

        return root;

    }
    
        

    public static void main(String[] args) {
        int value[] = { 3, 5, 6, 8, 10, 11, 12 };
        int st = 0;
        int end = value.length - 1;
        Node root = BalenceBST(st, end, value);
        Preorder(root);
        
    }
}