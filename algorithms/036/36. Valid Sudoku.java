package algorithms

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0;i < 9;i++) {
            Set s1 = new HashSet();
            for (int j = 0;j < 9;j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!s1.add(board[i][j])){
                    return false;
                }
            }
        }
        for (int i = 0;i < 9;i++) {
            Set s1 = new HashSet();
            for (int j = 0;j < 9;j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (!s1.add(board[j][i])){
                    return false;
                }
            }
        }

        for (int row = 0;row < 9; row = row + 3) {
            for (int cos = 0;cos < 9; cos = cos + 3) {
                Set s = new HashSet();
                for (int i = 0;i < 3;i++) {
                    for (int j = 0;j < 3;j++) {
                        if (board[row + i][cos + j] == '.') {
                            continue;
                        }
                        if (!s.add(board[row + i][cos + j])) {
                            return false;
                        }
                    }
                }

            }
        }
        return true;
    }
}
