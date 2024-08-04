class Solution {
    public boolean isValidSudoku(char[][] board) {
          Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cur = board[i][j];
                if (cur != '.') {
                    if (!set.add("row" + cur + i) || !set.add("col" + j + cur)
                            || !set.add("grid" + cur + i / 3 + j / 3)) {
                        return false;
                    }

                }

            }
        }
        return true;
        
    }
}