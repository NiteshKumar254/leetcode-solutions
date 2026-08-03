class Solution {
    public int longestConsecutive(int[] nums) {


        Set<Integer> st= new HashSet<>();

        for(int i: nums){

            st.add(i);

        }
     int longest=0;

        for( int j:st ){

          if(!st.contains(j-1)){
            
            int count=1;
            int num=j;

            while(st.contains(num+1)){
                count++;
                num++;
            }
              longest= Math.max( longest, count );
     }

        

        }

        return longest;


        
    }
}