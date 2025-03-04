import java.util.*;

//Here we make a Stack and Queue Using Deque

public class StacQue {

    
    static class Stack {

        Deque<Integer> ds = new LinkedList<>();
        
        //push
        public void push(int data) {
            ds.addLast(data);
        } 
        //pop
        public int pop() {
            return ds.removeLast();
        }
        //peek
        public int peek() {
            return ds.getLast();
        }
    }

    static class Queue {
        
        Deque<Integer> dq = new LinkedList<>();
        
        //add
        public void add(int data) {
            dq.addLast(data);
        }
        //remove
        public int remove() {
           return dq.removeFirst();
        }
        //peek
        public int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        System.out.println("Its Stack :");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());

        System.out.println("It is Queue");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
    }
}
