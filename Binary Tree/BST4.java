import java.util.*;

public class BST4 {
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

    public static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);

    }

    public static void GetInorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        GetInorder(root.left, arr);
        arr.add(root.data);
        GetInorder(root.right, arr);
    }

    public static Node CreateBalBST(ArrayList<Integer>arr,int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = CreateBalBST(arr, st, mid-1);
        root.right = CreateBalBST(arr, mid+1, end);
        return  root;
    }

    public static Node BSTtoBalcBST(Node root) { // Time Complexity is N(o) 
        //to Sort inorder ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        GetInorder(root, arr);
        // to create a new balenced BST
        return root = CreateBalBST(arr, 0, arr.size()-1);
        
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
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        
        /*
         Expected BST
               8
             /   \
            5     11
           / \    / \
          3   6  10 12
        
         */
        Node newroot = BSTtoBalcBST(root);
       Preorder(newroot);

    }
}