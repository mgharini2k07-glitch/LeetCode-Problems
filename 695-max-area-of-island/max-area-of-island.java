class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n=grid[0].length;
        int[][] vis = new int[m][n];
        int maxArea = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && vis[i][j] == 0){
                    maxArea = Math.max(maxArea, dfs(i, j, grid, vis));
                    
                }
            }

        }
        return maxArea;
    }
    int dfs(int r, int count, int[][]grid, int[][] vis){
            if(r<0|| count<0||r>=grid.length|| count>=grid[0].length){
                return 0;
            }
            if(grid[r][count] == 0 || vis[r][count]==1){
                return 0;
            }
            vis[r][count] =1;
            return 1 +dfs(r-1,count,grid,vis)
                    +dfs(r+1,count,grid,vis)
                    +dfs(r,count-1,grid,vis)
                    +dfs(r,count+1,grid,vis);
    }
}