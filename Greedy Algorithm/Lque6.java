import java.util.*;
//hard que to understand see it after some time

public class Lque6 {

    static class job{
        int id;
        int deadline;
        int profit;

        public job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
        
    }
    public static void main(String[] args) {
        int jobinfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<job> jobs = new ArrayList<>();

        for (int i = 0; i < jobinfo.length; i++) {
            jobs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);
          
        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        
        System.out.println("max jobs =" + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) +",");
        }

    }
}
