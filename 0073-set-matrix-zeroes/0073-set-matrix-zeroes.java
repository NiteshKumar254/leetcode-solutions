class Solution {
    public void setZeroes(int[][] matrix) {

        int markRow[]= new int[matrix.length];
        int markCol[]= new int [matrix[0].length];

        for(int i=0; i<matrix.length ; i++ ){
            for(int j=0; j<matrix[0].length ; j++ ){
                if (matrix[i][j]==-0){
                    markRow[i]=-1;
                    markCol[j]=-1;
                }
            }
        }
        for(int i=0; i<matrix.length ; i++ ){
            for(int j=0; j<matrix[0].length ; j++ ){
                if (markCol[j]==-1 || markRow[i]==-1){
                   matrix[i][j]=0;
                }
            }
        }



        
    }
}