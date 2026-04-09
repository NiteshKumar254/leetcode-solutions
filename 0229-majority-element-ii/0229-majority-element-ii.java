class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
           int count1=0;
           int count2=0;
           int elem1=0;
           int elem2=0;

           for(int i : nums){
             
              if(count1==0 && i!=elem2){
                 count1=1;
                 elem1=i;
              }
              else if ( count2==0 && i!=elem1){
                   count2=1;
                   elem2=i;      
              }  


              else if ( i==elem1  ){
                 count1++;
              }
              else if (i==elem2){
                 count2++;
              }

              else {
                count1--;
                count2--;
              }



           }

           List<Integer> list= new ArrayList<>();

           count1=0;
           count2=0;

           for(int i:nums){
            if(i==elem1){
                count1++;
            }
            else if(i==elem2){
                count2++;
            }
           }
           if(count1 > nums.length/3){
            list.add(elem1);
           }

           if (count2 > nums.length/3){
            list.add(elem2);
           }

           return list;
       


    }
}