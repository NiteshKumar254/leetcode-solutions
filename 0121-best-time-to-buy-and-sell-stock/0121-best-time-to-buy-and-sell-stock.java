class Solution {
    public int maxProfit(int[] prices) {


        int max=0;
        int smallest=Integer.MAX_VALUE;

        for(int i : prices){

            smallest=Math.min(smallest, i);

            max=Math.max(max, i-smallest);

        }
        return max;
        
    }
}