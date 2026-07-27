class Solution {
    public int maxProduct(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int sec_largest= Integer.MIN_VALUE;

        for(int i:nums){

            if(i>largest){
                sec_largest=largest;
                largest=i;
            }
            else if (i>sec_largest){
                sec_largest=i;
            }
        }

        return (largest-1)*(sec_largest-1);
        
    }
}