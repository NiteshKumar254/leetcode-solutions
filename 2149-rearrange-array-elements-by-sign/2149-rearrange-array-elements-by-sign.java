class Solution {
    public int[] rearrangeArray(int[] nums) {

        int ans[]= new int[nums.length];


        int posIndex=0;
        int negIndex=1;

        for(int i: nums){
            if(i>=0){
                ans[posIndex]=i;
                posIndex+=2;
            }
            else {
                ans[negIndex]=i;
                negIndex+=2;
            }

        }

        return ans;
        
    }
}