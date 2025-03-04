import java.util.*;
public class PreDefindQueue {
    public static void main(String[] args) {
       // Queue<Integer> q = new LinkedList<>(); //Quueue is not a datatype it is Interface
        Queue<Integer> q = new ArrayDeque<>(); //Quueue is not a datatype it is Interface
        q.add(1);                            //There is only 2 class to inplement queue 
        q.add(2);                            //LinkedList & ArrayDeque
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
