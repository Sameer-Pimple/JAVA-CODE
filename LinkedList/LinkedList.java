//import java.util.LinkedList;  We can't use linked list import because we already get our own linked list class 

public class  LinkedList{

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1 = create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newNode next = head
        newNode.next = head;

        //step3 = head = newNode
        head = newNode;
    }

    public int removeFirst() {
        if (size ==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    
    public void addLast(int data) {

        //step1 create a new NODE
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step2 
        tail.next = newNode;

        //step3 
        tail = newNode;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);

        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int index = 0;
        while (index < idx - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1){
            return -1;
    }
    return idx+1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void Reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void Remove_nth_node(int n) {
        if (size == n) {
            head = head.next;
        }
        Node prev = head;
        int i = 1;
        while (i<size-n) {
            prev = prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");

        }
        System.out.println("null");
    }

    public Node midpoint(Node head) {
        Node slow= head;
        Node fast = head;
        while (fast.next != null && fast != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public boolean Palindrom() {
        //Base Case
        if (head == null || head.next == null) {
            return true;
        }
        //step1 finding midpoint
        Node midpoint = midpoint(head);
        //step2 reverse 2nd half
        Node prev = null;
        Node curr = midpoint;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        //step3 1st half 2nd half compair
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public boolean cycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void Removecycle() {
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                prev = fast;
                fast = fast.next;
                if (slow == fast) {
                    prev.next = null;
                }
            }
        }
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();//1->2->3->2->1->null
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.Palindrom());
        
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // ll.addLast(7);
        // ll.add(2, 3);
        // ll.print();
        // ll.Remove_nth_node(3);
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(recsearch(9));
        // System.out.println(recsearch(90));
        // System.out.println("Size of LinkedList: "+ll.size);
        // ll.Reverse();
        // ll.print();
    }
}


  