import java.util.*;
import java.util.LinkedList;

public class Que1 {

    public static boolean Palindrom(LinkedList<Integer> list) {
        Stack<Integer> s = new Stack<>();

        // add to stack
        for (int i = 0; i < list.size(); i++) {
            s.push(list.get(i));
        }

        // compair

        // base case
        if (s.isEmpty() || list.size() <= 1) {
            return true;
        }

        // more code
        // while (!s.isEmpty()) {
        // for (int i = 0; i < list.size(); i++) {
        // if (list.get(i) == s.peek()) {
        // s.pop();
        // } else {
        // return false;
        // }
        // }
        // }
        // less code
        for (int i = 0; i < list.size(); i++) {
            if (!s.pop().equals(list.get(i))) { // Note:- if we have to compair two objects we can use .equals
                                                // function(for int,char,etc. we use ==)(for Integer ,Charactor etc. we
                                                // used .equals)
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        System.out.println(Palindrom(list));

    }
}