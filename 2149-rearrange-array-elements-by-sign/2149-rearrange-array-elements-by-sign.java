class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[]=new int[nums.length];
        int pindex=0;
        int nindex=1;

        for(int i : nums){
            if (i>0){
                ans[pindex]=i;
                pindex+=2;

            }
            else 
            {
                ans[nindex]=i;
                nindex+=2;
            }
        }

        return ans;


        
    }
}