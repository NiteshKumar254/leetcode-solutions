class Solution {
    public int maxProfit(int[] prices) {


        int buyPrice=Integer.MAX_VALUE;;
      
         int max_profit=0;

        for(int i=0; i<prices.length ; i++){

       if (prices[i]< buyPrice){
          buyPrice=prices[i];
       }
       
      

        max_profit= Math.max(max_profit, prices[i]-buyPrice);



     

        }

        return max_profit;







        
    }
}