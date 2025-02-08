// import java.util.LinkedList;
public class Part2 {

    public class Node {
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


    public Node midNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

    }

    public Node merge(Node head1, Node head2) {
        Node mergenode = new Node(-1);
        Node temp = mergenode;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergenode.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find Mid 
        Node mid = midNode(head);
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        return merge(newleft, newright);

    }
    
    public void ZigZak() {
        //find Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //make 2 Linkedlist
        Node curr = mid.next;
        mid.next = null;
        //reverce 2nd ll
        Node prev = null;

        Node next ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //combine
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left !=null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    

    public static void main(String[] args) {
        Part2 ll = new Part2(); //1->2->3->4->5->null
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        // ll.head = ll.mergesort(ll.head);
        ll.ZigZak();
        ll.print();

        // System.out.println(ll.MidNode(head));
        
    }
}