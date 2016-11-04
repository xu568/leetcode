public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (set.contains(board[i][j])) {
                        System.out.println(1);
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (set.contains(board[j][i])) {
                        System.out.println(2);
                        return false;
                    } else {
                        set.add(board[j][i]);
                    }
                }
            }
            set.clear();
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = i/3*3; j <= i/3*3+2; j++) {
                for (int k = 3*(i%3); k <= 3*(i%3)+2; k++) {
                    if (board[j][k] != '.') {
                        if (set.contains(board[j][k])) {
                            return false;
                        } else {
                            set.add(board[j][k]);
                        }
                    }
                }
            }
            set.clear();
        }
        
        return true;
    }
}