class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxp=0;
        for (int i: prices){
            int curr=i-min;

            maxp=Math.max(maxp,curr);

            min=Math.min(min,i);
        }
        return maxp;


        
    }
}