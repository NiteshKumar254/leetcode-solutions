class Solution {
    public void sortColors(int[] nums) {

        int one=0;
        int two=0;
        int zero=0;

        for(int i: nums){
            if(i==1 ){
                one++;
            }
            else if (i== 2){
                two++;
            }
            else {
                zero++;
            }
        }

        int index=0;

        for(int i=0 ; i< zero ; i++){
            nums[index++]=0;
            
        }

        for(int j=zero; j< zero+one ; j++){
            nums[index++]=1;
        }

        for(int k=zero+one;  k<nums.length ; k++){
            nums[index++]=2;
        }

    


        
    }
}