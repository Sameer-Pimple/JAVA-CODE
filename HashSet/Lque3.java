package HashSet;
//Find Itinerary<travel points> from Tickets
import java.util.*;

public class Lque3 {
    
    public static String Getstart(HashMap<String, String> tickets) {
        HashMap<String, String> revmap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Benguluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        /*
        Here We compair the from , To where we findout the location which is not a destination of aarive..which is starting point 
        */
        
        String start = Getstart(ticket);
        System.out.print(start);
        for (String key : ticket.keySet()) {
            System.out.print("->"+ticket.get(start));
            start = ticket.get(start);
        }
        System.out.println();
    }
}
