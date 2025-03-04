public class LectDescripLinkedList {
    // Que Using Linkedlist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;
    
    
        // empty function
        public  boolean isEmpty() {
            return head == null && tail == null;
        }

        // Add
        public  void add(int data) {
            Node newnode = new Node(data);
            // adding 1st element
            if (head == null) {
                head = tail= newnode ;
            }
            tail.next = newnode;
            tail = newnode;
        }

        // Remove
        public  int Remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                 tail = head = null;
             }
             else {
                 head = head.next;
             }
             return front;
        }

        // peek
        public  int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.Remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.Remove();
        }
    }

}
