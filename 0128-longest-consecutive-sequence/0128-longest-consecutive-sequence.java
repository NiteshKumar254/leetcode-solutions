class Solution {
    public int longestConsecutive(int[] nums) {
       
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }

        int longest=1;
        int curr_smallest=nums[0];
        int count=1;
       
        for (int i=1; i<nums.length ; i++){
            int curr= nums[i];
           
            if( curr_smallest+1 == curr){
                count++;
                curr_smallest=curr; 
                longest= Math.max(longest, count);
            }

             else if ( curr_smallest==curr){
                  
                   continue;

            }
            else {
                curr_smallest=curr;
                count=1;
            }
        }

        return longest;    

    }
}