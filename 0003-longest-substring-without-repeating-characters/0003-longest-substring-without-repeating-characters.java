class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set= new HashSet<>();

        int left=0;
        int right=0;
       int max=0;

        while( right<s.length()){
            char ch= s.charAt(right);

      if (set.contains(ch)){
            set.remove(s.charAt(left));
            left++;

      }
      else {
        set.add(s.charAt(right));
        max=Math.max(max, right-left+1);
        right++;
      }
       
     

        }
        return max;

        


    }
}