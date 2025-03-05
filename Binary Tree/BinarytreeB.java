import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeB {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
           this.data = data;
           this.left = null;
           this.right = null;
        }
    }
    
    static class Binarytree{
        static int idx = -1; 

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
            
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }
        
        public static void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
        
        public static void Postorder(Node root) {
            if (root == null) {
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }
        
        public static void Levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;  
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right); 
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildtree(nodes);

        System.out.print("Preorder tree :");
        tree.preorder(root);
        System.out.println();
        System.out.print("Inorder tree :");
        tree.Inorder(root);
       System.out.println();
        System.out.print("Postorder tree :");
        tree.Postorder(root);
         System.out.println();
         System.out.println("Levelorder tree :");
        tree.Levelorder(root);
        
    }
}