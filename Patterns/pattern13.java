public class pattern13 {
    
        public static void main(String[] args) {
            // Number of rows
            int num_rows = 2;
    
            // Upper part of the pattern
            for (int i = 1; i <= num_rows; i++) {
                // Print spaces
                for (int j = num_rows - i; j > 0; j--) {
                    System.out.print(" ");
                }
                
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                
                System.out.println();  // Move to the next line after each row
            }
    
            // Lower part of the pattern
            for (int i = num_rows - 1; i >= 1; i--) {
                // Print spaces
                for (int j = num_rows - i; j > 0; j--) {
                    System.out.print(" ");
                }
                
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                
                System.out.println();  // Move to the next line after each row
            }
        }
    }
    
    
