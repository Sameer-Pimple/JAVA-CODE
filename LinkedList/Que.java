public class Que {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        public Node head;
        public Node tail;
        public int size;

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

        public void Print() {
            if (head == null) {
                System.out.println("LinkedList is Empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static Node Intersect(Node head1 , Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;

            while (temp2 != null) {
                temp1 = head1;
                while (temp1 != null) {
                    if (temp1 == temp2) {
                        return temp1;
                    }
                    temp1 = temp1.next;
                }
                temp2 = temp2.next;
            }
            return null;
        }
        
    public static void main(String args[]) {
        Que L1 = new Que();
        Que L2 = new Que();
        L1.addLast(1);
        L1.addLast(2);
        L1.addLast(3);
        L1.addLast(6);
        L1.addLast(7);
        L2.addLast(4);
        L2.addLast(5);
        L2.addLast(6);
        L2.addLast(7);
        System.out.println(Intersect(L1.head, L2.head));
        

        
        
    }
}
