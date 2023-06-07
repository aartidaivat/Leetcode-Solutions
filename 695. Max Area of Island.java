class Solution {
    int maxArea=0, areaOfIsland=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[0].length; c++) {   
                if(grid[r][c]==1) {
                    areaOfIsland=0;
                    dfs(r,c,grid);
                    maxArea=Math.max(areaOfIsland,maxArea);
                }
            }
        }
        return maxArea;
    }
    
    public void dfs(int row, int col, int[][] grid) {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0) {
            return;
        }
        areaOfIsland += 1;
        grid[row][col]=0;
        dfs(row-1,col,grid);
        dfs(row+1,col,grid);
        dfs(row,col-1,grid);
        dfs(row,col+1,grid);
    }
}
