class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int dir=0, left=0, right=matrix[0].length-1, top=0, bottom=matrix.length-1;
        List<Integer> list = new ArrayList<>();
        while(left<=right && top<=bottom) {
            if(dir==0) {
                for(int i=left; i<=right; i++) {
                    list.add(matrix[top][i]);
                }
                top += 1;
            }
            else if(dir==1) {
                for(int i=top; i<=bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right -= 1;
            }
            else if(dir==2) {
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom -= 1;
            }
            else if(dir==3) {
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
                left += 1;
            }
            dir = (dir+1) % 4;
        }
        return list;
    }
}
