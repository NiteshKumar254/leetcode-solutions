class Solution {
    public int maxProfit(int[] prices) {

        int currp=0;
        int maxp=0;
        int min=prices[0];

         for(int i=1; i<prices.length ; i++){
    
          currp=prices[i]-min;
            min= Math.min(min,prices[i]);
          maxp=Math.max(currp,maxp);

        




         }

         return maxp;


        
    }
}