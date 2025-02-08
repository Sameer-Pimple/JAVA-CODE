import java.util.Stack;
public class StackLinkedList {
    // Using LinkedList
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static Node head = null;

    public static boolean isEmpty() {
        return head == null;
    }
    //Push
    public static void push(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            newnode = head;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    //Pop
    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    //Peek
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String args[]){
        Stack s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
 