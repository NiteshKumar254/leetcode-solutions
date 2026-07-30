class Solution {
    public int minimumPushes(String word) {

        int length=word.length();
        int ans=0;

        for (int i=0; i<length; i++){

            ans+=i/8+1;


        }

        return ans;
        
    }
}