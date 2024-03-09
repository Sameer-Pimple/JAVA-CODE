// import java.util.*;

public class Array7 {

   public static void Subarrays(int number[]){
      
      for(int i=0; i<number.length ;i++){
         int start = number[i];
         for(int j = i+1; j<number.length; j++){
            System.out.print( "(" +start+ "," + number[j] + ")" );
         }  
            System.out.println();
      }
   }

   public static void main(String args[]){
      int number[]={2,4,6,8,10};
      Subarrays(number);
   }
}