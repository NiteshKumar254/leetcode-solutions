class Solution {
    public void sortColors(int[] nums) {
        int countZero=0;
        int countTwo=0;
        int countOne=0;
        for (int i=0; i<nums.length ; i++){
            if (nums[i]==0){
                countZero++;
            }
            else if (nums[i]==2){
                countTwo++;
            }
            else{
                countOne++;
            }

        }

        int set=0;
        while(set<countZero){
            nums[set++]=0;
        }

        while(set<countZero+countOne){
            nums[set++]=1;
        }
        while(set<nums.length){
            nums[set++]=2;
        }
        
    }
}