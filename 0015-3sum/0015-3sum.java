class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> st = new HashSet<>();

        for(int i=0; i<nums.length ; i++){

            Set<Integer> temp = new HashSet<>();
            for(int j=i+1 ; j<nums.length ; j++){

                List<Integer> lt= new ArrayList<>();

                if(temp.contains(-(nums[i]+nums[j]))){

                        lt.add(nums[i]);
                        lt.add(nums[j]);
                        lt.add(-(nums[i]+nums[j]));
                        Collections.sort(lt);
                        st.add(lt);

                }
                temp.add(nums[j]);




            }
        }

        return new ArrayList<>(st);
        
    }
}