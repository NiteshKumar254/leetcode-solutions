class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);



        int max_count=0;
        int curr_count=1;
     
        for(int i=1; i<nums.length ; i++){
            if(nums[i]==nums[i-1]+1){
                curr_count++;
            }
        
         else if(  nums[i]==nums[i-1]) {
            continue;
         }
            else {
                max_count=Math.max(curr_count, max_count);
                curr_count=1;
            }
        }

        return Math.max(max_count, curr_count);


        
    }
}