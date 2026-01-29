class Solution {
    public boolean isPalindrome(int x) {

        int num=x;
        int revNo=0;
        while (num>0){
            int ld=num%10;
            revNo=revNo*10+ld;
            num/=10;

        }
        return x==revNo;
        
    }
}