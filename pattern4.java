public class pattern4 {
    public static void main(String[] args) {
     int n=5;
     char ch = 'A';
     for(int line = 1; line<=n; line++){
        for(int word = 1; word <= line; word++ ){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }

    }
}

