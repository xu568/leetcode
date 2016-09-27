public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) return false;
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (dfs(board, i, j, visited, word, 0)) return true;
        	}
        }
        return false;
    }

    private boolean dfs(char[][] board, int x, int y, boolean[][] visited, String word, int k) {
    	if (k == word.length()) return true;
    	if (x >= board.length || x < 0) return false;
    	if (y >= board[0].length || y < 0) return false;
    	if (visited[x][y] == true) return false;
    	if (board[x][y] != word.charAt(k)) return false;

    	visited[x][y] = true;
    	if (dfs(board, x+1, y, visited, word, k+1)) return true;
    	if (dfs(board, x-1, y, visited, word, k+1)) return true;
    	if (dfs(board, x, y-1, visited, word, k+1)) return true;
    	if (dfs(board, x, y+1, visited, word, k+1)) return true;
    	visited[x][y] = false;
    	return false;
    }
}