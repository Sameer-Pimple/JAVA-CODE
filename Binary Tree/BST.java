import java.util.*;
public class BST {

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
    
    public static Node deletenode(Node root, int value) {
        if (root.data < value) {
            root.right = deletenode(root.right, value);
        }
        else if (root.data > value) {
            root.left = deletenode(root.left, value);
        } else {
            //Case for Leaf Node
            if (root.right == null && root.left == null) {
                return null;
            }
            // Case for  Single Chiled
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            }
            // Case For both Double Children
            Node Is = Inordersucceser(root.right);
            root.data = Is.data;
            root.right = deletenode(root.right, Is.data);
        }
        return root;
    }

    public static Node Inordersucceser(Node root) {
        while (root != null) {
            root = root.left;
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void Printrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        //both
        if (root.data >= k1 && root.data <= k2) {
            Printrange(root.left, k1, k2);
            System.out.print(root.data + " ");
            Printrange(root.right, k1, k2);
        }
        //left
        else if (root.data < k1) {
            Printrange(root.left, k1, k2);

        }
        //right
        else {
            Printrange(root.right, k1, k2);
        }
    }
    
    public static void PathPrint(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            Printpath(path);
        }
        PathPrint(root.left, path);
        PathPrint(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void Printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        int value[] = { 8, 5, 3, 6, 10, 11, 14 };
        ArrayList<Integer> path = new ArrayList<>();
        
        /*
            5
           / \
          1   7
           \
            3
           / \
          2   4 

         */
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = Insert(root, value[i]);
        }
        
        Inorder(root);
        System.out.println();
      PathPrint(root, path);    
    }
}