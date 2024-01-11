/*
Example 2: 200. Number of Islands

Given an m x n 2D binary grid which represents a map of 1 (land) and 0 (water), return the number of islands. 
An island is surrounded by water and is formed by connecting adjacent land cells horizontally or vertically.
*/

package TreesAndGraphs_Graphs;

public class DFSNumberOfIslands {
    int m ;
    int n;
    int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    boolean[][] seen ;

    public int numberOfIslands(char[][] grid){
        int ans=0;
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];

        for(int row = 0; row < m ; row++){
            for(int col = 0 ; col< n ; col++){
                if(grid[row][col] == '1' && !seen[row][col]){
                   ans++;
                   seen[row][col]= true;
                   dfs(row, col, grid); 
                }
            }
        }
        return ans;
    }

    private void dfs(int row, int col, char[][] grid) {
        for (int[] direction: directions) {
            int nextRow = row + direction[0];
            int nextCol = col + direction[1];

            if (valid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                seen[nextRow][nextCol] = true;
                dfs(nextRow, nextCol, grid);
            }
        }
    }

    private boolean valid(int row, int col, char[][] grid) {
        return (0 <= row 
                && row < m 
                && 0 <= col 
                && col < n 
                && grid[row][col] == '1');
    }
}
