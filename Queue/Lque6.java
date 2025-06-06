import java.util.*;
import java.util.LinkedList;
public class Lque6 {

    public static void ReverceQueue(Queue<Integer> q) {

        int size = q.size();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < size; i++) {
            s.push(q.remove());

        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        ReverceQueue(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
