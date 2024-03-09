  
public class DigonalSum {
  
    public static void main (String args[]){
        int sum = 0;
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};

        for(int i=0; i<=matrix.length-1; i++){
            sum +=matrix[i][i];
            
            }
            System.out.println("Sum of Digonal's is " + sum);
        }
        
    }
  
  