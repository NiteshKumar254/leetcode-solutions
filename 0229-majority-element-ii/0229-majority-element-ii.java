class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List <Integer> list= new ArrayList<>();

        int req= nums.length/3;

          int elem1 =Integer.MIN_VALUE;
          int count1=0;

          int elem2= Integer.MIN_VALUE;
          int count2=0;

          for(int i: nums){

           if(count1==0 && i !=elem2 ){
 
               count1++;
               elem1= i;

           }

           else if ( count2==0 && i!=elem1){

            count2++;
            elem2=i;

           }

           else if (i==elem1){
            count1++;
           }
           else if (i==elem2){
            count2++;
           }

           else{
            count1--;
            count2--;
           }


          }

         count1 = 0;
        count2 = 0;

        for (int i : nums) {
            if (i == elem1)
                count1++;
            else if (i == elem2)
                count2++;
        }

        if (count1 > req)
            list.add(elem1);

        if (count2 > req)
            list.add(elem2);

        return list;



        
    }
}