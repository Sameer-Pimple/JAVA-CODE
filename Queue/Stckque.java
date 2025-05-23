import java.util.*;
//Here we make a Queue Using the Stack

public class Stckque {

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
                
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        //add
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int last = s1.pop();
            return last;
        }

        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
