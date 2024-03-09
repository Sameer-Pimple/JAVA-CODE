public class ArrayQUE3 {
    public static int QUE2(int prices[]){
        int Maxprofit=0;
        int Buyprice=Integer.MAX_VALUE;
        for(int i=1; i<prices.length; i++){
            if(Buyprice < prices[i]){
                int profit = prices[i]-Buyprice;
                Maxprofit=Math.max(Maxprofit, profit);
            }else{
                Buyprice = prices[i];
            }
        }
    return Maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,6,4,3,1};
        System.out.println(QUE2(prices));
    }
}

