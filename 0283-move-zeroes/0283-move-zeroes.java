class Solution {
    public void moveZeroes(int[] nums) {

        int index=0;

        for(int i: nums){
            if(i!=0){
                nums[index++]=i;
            }
        }

        if (index<nums.length){
            while (index<nums.length){
                nums[index++]=0;
            }
        }
        
    }
}