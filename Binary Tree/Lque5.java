import java.util.*;
//printing the Kth level of an tree

public class Lque5 {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static void Kthlevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
        }
        Kthlevel(root.left, level + 1, k);
        Kthlevel(root.right, level + 1, k);

    }
    
    public static Node Lca(Node root, int n1, int n2) { // solved without any space
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = Lca(root.left, n1, n2);     
        Node rightlca = Lca(root.right, n1, n2);

        if (leftlca == null) {
            return rightlca;
        }
        if (rightlca == null) {
            return leftlca;
        }
        return root;
    }

    public static int finddistance(Node root , int n) { // it is a helper function for Mindistance...
    if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftdist =finddistance(root.left, n);
        int rightdist =finddistance(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }else if (rightdist == -1) {
            return leftdist + 1;
        } else { 
            return rightdist + 1;
        }

    }

    public static int Mindistance(Node root, int n1, int n2) {
        Node lca = Lca(root, n1, n2);
        int dist1 = finddistance(lca, n1);
        int dist2 = finddistance(lca, n2);

        return dist1 + dist2;
    }
    
    public static int transform(Node root) {
        if (root == null) {
            return 0;
        }
        int leftchild = transform(root.left);
        int rightchild = transform(root.right);

        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        
        root.data = newleft + leftchild + newright + rightchild;
        return data;
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
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        /*
                1
               / \         
              2    3
             / \  / \
            4   5 6  7
        
         */
        // Kthlevel(root, 1, 3);
        int n1 = 4, n2 = 7;
        // System.out.println(Lca(root, 4, 5).data);
        // System.out.println(Mindistance(root, n1, n2));

        transform(root);
        Preorder(root);
    }
}