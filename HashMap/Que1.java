package HashMap;

import java.util.*;

// Print top view que
// if we need to use a binary tree we always need to define  Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// Info class is used to to store the Hori. Distance of a Node which Track The
// index from 0 to left & right
class Info {
    int hd;
    Node node;

    Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class Que1
{

    public static void topView(Node root) {
        // we need a hashmap to to track the index of a Node
        HashMap<Integer, Node> Map = new HashMap<>();
        // Queue is used to store the values of Only One level...and then we remove and
        // add Another level values
        Queue<Info> q = new LinkedList<>();
        int min = 0, max = 0;// this used to sort the order of Node from left to right
        // If you use TreeMap instead of HashMap, you don’t need to track min and max:
        /*
         * |
         * |
         * (1)
         * -------(-1)(0)(1)--------
         * (-1)
         * |
         * |
         * 
         * we used the logic like a graph of which track the index like a index of root
         * node is 0
         * then the root.left is index-1....and the root.right is index+1....
         * if we track the index using Hashmap then we can compair the value of index
         * which means we
         * see the Index 0 and l if we get left then -1 from index if right then get
         * +1...the index of the root node ke niche wale node ki root node ke equal hi
         * hogi
         * /*
         * 1(0)
         * / \
         * 2(-1) 3(+1)
         * / \ / \
         * 4(-2) 5(0) 6(0) 7(+2)
         */

        // Level Order
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!Map.containsKey(curr.hd)) {
                    Map.put(curr.hd, curr.node);
                }
                // going for left side
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                // going for right side
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        // to print the node in sorted order we print using the less value on
        // X-axis...and high from X-Axis

        for (int i = min; i <= max; i++) {
            System.out.print(Map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root); // Output should be:4 2 1 3 7
    }
}
