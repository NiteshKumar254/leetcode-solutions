class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> set= new HashSet<>();
        int count=0;

        int index=0;

        for(int i: nums){
            if(!set.contains(i)){
                
              nums[index++]=i;

                set.add(i);
                count++;
            }

        }
      

        return count;

        
    }
}