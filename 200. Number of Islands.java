class Solution {
    public int numIslands(char[][] grid) {
        int numOfIsland=0;
        for(int r=0; r<grid.length; r++) {
            for(int c=0; c<grid[0].length; c++) {
                if(grid[r][c]=='1') {
                    numOfIsland += 1;
                    dfs(r,c,grid);
                }
            }
        }
        return numOfIsland;
    }

    public void dfs(int row, int col, char[][] grid) {
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0') {
            return;
        }
        grid[row][col]='0';
        dfs(row-1, col, grid);
        dfs(row+1, col, grid);
        dfs(row, col-1, grid);
        dfs(row, col+1, grid);
    }
}
