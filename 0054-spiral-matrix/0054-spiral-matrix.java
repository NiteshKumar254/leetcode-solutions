class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        ArrayList<Integer> list=new ArrayList<>();

        while (top<=bottom && left <= right){
            // left to right
            for (int i=left; i<=right; i++){
             list.add(matrix[top][i]);

            }
            top++;

            //top to bottom
            for (int i=top; i<= bottom ; i++){
                list.add(matrix[i][right]);


            }
            right--;

            //right to left

           if (top<=bottom){

            for(int i= right; i>=left; i--){

                list.add(matrix[bottom][i]);

            }
            bottom--;
            }


             if (left<= right){
            //bottom to top
            for(int i=bottom ; i>=top ;i--){

                list.add(matrix[i][left]);


            }
            left++;
           }




        }
        return list;
    }
}