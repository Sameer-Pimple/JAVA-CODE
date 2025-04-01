public class Lque3 {
    public static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Apporch No.2 N(o)
    static class Info {
        int Diameter;
        int ht;

        public Info(int Diameter, int ht) {
            this.Diameter = Diameter;
            this.ht = ht;
        }
    }
    
    public static Info Diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);

        int Diameter = Math.max(Math.max(leftInfo.Diameter, rightInfo.Diameter), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        
        return new Info(Diameter, ht);
    }

    //Apporch No.1 N(o)squre
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int Maxheight = Math.max(lh , rh) + 1;
        return Maxheight;
    }
    
    public static int Diameter2(Node root) {
    if (root == null) {
            return 0;
        }
        int ld = Diameter2(root.left);
        int lhei = height(root.left);
        int lr = Diameter2(root.right);
        int rhei =height(root.right);

        int Diameter = lhei + rhei + 1;
        

        return Math.max(Diameter, Math.max(ld, lr));

    }

    public static void main(String args[]) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right = new Node(7  );
        System.out.println("Apporch1 :"+Diameter2(root));
        System.out.println("Approch2 :"+Diameter(root).Diameter);
        System.out.println("Approch2 :"+Diameter(root).ht);
    }
}
