class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set= new HashSet<>();
        int index=0;
        int count=0;
        for(int i : nums){
            if(!set.contains(i)){
                nums[index++]=i;
                 count++;
            }
            set.add(i);
        }
       return count;

        
    }
}