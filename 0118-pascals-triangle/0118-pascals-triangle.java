class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();


        for(int i=1; i<=numRows; i++){
            list.add(rowdata(i));
        }
        return list;
        
    }
    public static List<Integer> rowdata(int n){

        List<Integer> list= new ArrayList<>();
        int ans=1;
        list.add(ans);

         for(int i=1; i<n ; i++){

            ans=ans*(n-i)/i;
             list.add(ans);

         }
         return list;
        
 

    }
}