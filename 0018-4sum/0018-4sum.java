class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                Set<Long> st = new HashSet<>();

                for (int k = j + 1; k < nums.length; k++) {

                    long sum3 = (long) nums[i] + nums[j] + nums[k];
                    long fourth = (long) target - sum3;

                    if (st.contains(fourth)) {
                        List<Integer> lt = new ArrayList<>();
                        lt.add(nums[i]);
                        lt.add(nums[j]);
                        lt.add(nums[k]);
                        lt.add((int) fourth); // safe cast (original nums are int)

                        Collections.sort(lt);
                        set.add(lt);
                    }

                    st.add((long) nums[k]);
                }
            }
        }

        return new ArrayList<>(set);
    }
}