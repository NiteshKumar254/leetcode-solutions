class Solution {
    public int maxProfit(int[] prices) {

        int currp=0;
        int maxp=0;
        int min=prices[0];

         for(int i=1; i<prices.length ; i++){
    
          currp=prices[i]-min;
          maxp=Math.max(currp,maxp);

          min= Math.min(min,prices[i]);




         }

         return maxp;


        
    }
}