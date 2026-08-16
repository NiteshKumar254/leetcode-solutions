class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums){
            if(n>0){
                hs.add(n);
            }
        }
  int sm=1;
        while(hs.contains(sm)){
            sm++;
        }
        return sm;
       
  
    }
}