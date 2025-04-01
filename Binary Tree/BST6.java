import java.util.ArrayList;

public class BST6 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left =  this.right = null;
        }

    }

    public static void GetinOrder(ArrayList<Integer> arr, Node root) {
        if (root == null) {
            return;
        }
        GetinOrder(arr, root.left);
        arr.add(root.data);
        GetinOrder(arr, root.right);
    }

    public static Node CreateBST(ArrayList<Integer> arr, int st, int end) {
        if (st> end) {
            return null;
        }
        int Mid = (st + end) / 2;
        Node root = new Node(arr.get(Mid));
        root.left = CreateBST(arr, st, Mid-1);
        root.right = CreateBST(arr, Mid+1, end);
        return root;
    }
    
    public static Node MergeBST(Node root1, Node root2) {

        //step1
        ArrayList<Integer> list1 = new ArrayList<>();
        GetinOrder(list1, root1);

        //step2
        ArrayList<Integer> list2 = new ArrayList<>();
        GetinOrder(list2, root2);

        //merge
        int i = 0, j = 0;
        ArrayList<Integer> finallist = new ArrayList<>();
        while (i < list1.size() && j < list2.size()) {

            if(list1.get(i) <= list2.get(j)) {
                finallist.add(list1.get(i));
                i++;
            }
            else{
                finallist.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            finallist.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            finallist.add(list2.get(j));
            j++;
        }
        return CreateBST(finallist, 0, finallist.size() - 1);
    }

    public static void Preorder(Node root) {
        
        if (root == null) {
            return ;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }


    public static void main(String[] args) {
        /*
                2
              /   \
              1    4
               BST1
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
              9
            /  \
           3    12
              BST2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
                3
              /   \
             1     9 
              \   / \+---
               2  4  12
               Final ans: BST
         */

        Node root = MergeBST(root1, root2); //TIme complexity is O(n+m) ->Linear Time
        Preorder(root);
    }
    
}
