class Solution {
    public int removeDuplicates(int[] nums) {

        TreeSet<Integer> set= new TreeSet<>();
        int count=0;

        for(int i: nums){
            if(!set.contains(i)){
                set.add(i);
                count++;
            }
        }
        int index=0;
        for (int j: set){
            nums[index++]=j;
        }

        return count;

        
    }
}