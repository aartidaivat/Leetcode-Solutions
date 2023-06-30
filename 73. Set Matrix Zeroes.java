class Solution {
    public void setZeroes(int[][] matrix) {
        int x=1, y=1, rows=matrix.length, cols=matrix[0].length;
        for(int j=0; j<cols; j++) {
            if(matrix[0][j]==0) x=0;
        }

        for(int i=0; i<rows; i++) {
            if(matrix[i][0]==0) y=0;
        }

        for(int i=1; i<rows; i++) {
            for(int j=1; j<cols; j++) {
                if(matrix[i][j]==0) {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i=1; i<rows; i++) {
            for(int j=1; j<cols; j++) {
                if(matrix[0][j]==0 || matrix[i][0]==0) {
                    matrix[i][j]=0;
                }           
            }
        }

        if(x==0) {
            for(int j=0; j<cols; j++) {
                matrix[0][j]=0;
            }
        }

        if(y==0) {
            for(int i=0; i<rows; i++) {
                matrix[i][0]=0;
            }
        }
    }
}
