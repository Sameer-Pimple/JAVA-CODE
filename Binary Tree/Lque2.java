//Finding The Count of an nodes that how many counts in an tree
public class Lque2 {

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

    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = Count(root.left);
        int rc = Count(root.right);
        int Maxcount = (lc + rc) + 1;
        return Maxcount;
    }
    
    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = Sum(root.left);
        int rightsum = Sum(root.right);
        int total = leftsum + rightsum + root.data;
        return total;
    }
    
    
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Total Count of All Nodes In tree :"+Count(root));
        System.out.println("Total Sum of All Nodes In tree :"+Sum(root));
    }
}
