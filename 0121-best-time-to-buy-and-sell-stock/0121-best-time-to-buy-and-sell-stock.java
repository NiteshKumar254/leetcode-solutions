class Solution {
    public int maxProfit(int[] prices) {

        int currp=0;
        int maxp=0;
        int smallest=prices[0];

        for(int i: prices){
            currp=i-smallest;
            smallest=Math.min(smallest,i);
            maxp=Math.max(currp,maxp);
        
        }

        return maxp;
        
    }
}