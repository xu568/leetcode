public class Solution {
    public int numIslands(char[][] grid) {
    	if(grid == null || grid.length == 0)
    		return 0;
    	int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		if (grid[i][j] == '1' && visited[i][j] == false) {
        			result++;
        			dfs(grid, i, j, visited);
        		}
        	}
        }
        return result;
    }

    private void dfs(char[][] grid, int x, int y, boolean[][] visited) {
    	visited[x][y] = true;
    	if (x + 1 < grid.length && grid[x+1][y] == '1' && visited[x+1][y] == false) {
    		dfs(grid, x+1, y, visited);
    	}
    	if (y + 1 < grid[0].length && grid[x][y+1] == '1' && visited[x][y+1] == false) {
    		dfs(grid, x, y+1, visited);
    	}
    	if (x - 1 >= 0  && grid[x-1][y] == '1' && visited[x-1][y] == false) {
    		dfs(grid, x-1, y, visited);
    	}
    	if (y - 1 >= 0  && grid[x][y-1] == '1' && visited[x][y-1] == false) {
    		dfs(grid, x, y-1, visited);
    	}
    }
}