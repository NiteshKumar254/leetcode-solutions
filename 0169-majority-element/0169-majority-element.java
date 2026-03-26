class Solution {
    public int majorityElement(int[] nums) {
        int maj=nums[0];
        int count=1;
        for (int j=1; j<nums.length; j++){
            int i= nums[j];
            if (i==maj){
                count++;
            }
               else if (count==0){
                maj=i;
            }
            else if (i!=maj){
                count--;
            }
         
        }
         return maj;
        
    }
}