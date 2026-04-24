class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int req_times=nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }

        for(int i: map.keySet()){
            if( map.get(i) > req_times ){
                list.add(i);
                  
            }
        }

        return list;




    }
}