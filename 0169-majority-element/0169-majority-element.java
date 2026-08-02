class Solution {
    public int majorityElement(int[] nums) {

            HashMap<Integer, Integer> map= new HashMap<>();

            for(int i:nums){
                map.put(i, map.getOrDefault(i,0)+1);
            }

            for(int j:map.keySet()){
                if (map.get(j) > nums.length/2){
                    return j;
                }
            }
        return -1;
    }
}