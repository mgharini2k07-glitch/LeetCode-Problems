class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n=grid[0].length;
        int[][] vis = new int[m][n];
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    count++;
                    dfs(i,j,grid,vis);
                }
            }

        }
        return count;
    }
    
    void dfs(int r, int count, char[][]grid, int[][] vis){
            if(r<0|| count<0||r>=grid.length|| count>=grid[0].length){
                return;
            }
            if(grid[r][count] == '0' || vis[r][count]==1){
                return;
            }
            vis[r][count] =1;
            dfs(r-1,count,grid,vis);
            dfs(r+1,count,grid,vis);
            dfs(r,count-1,grid,vis);
            dfs(r,count+1,grid,vis);
    }
}