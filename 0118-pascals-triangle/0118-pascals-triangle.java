class Solution {
    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> list= new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> temp= new ArrayList<>();
              for(int j=0; j<=i; j++){
                temp.add(findComb(i,j));         
            }
            list.add(temp);
        }
        return list;   
    }

    public static int findComb(int n, int r){
        int ans=1;
        for(int i=0;i<r; i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }

}