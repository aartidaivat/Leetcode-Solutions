class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int r=0; r<9; r++) {
            rows[r] = new HashSet<Character>(); 
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r=0; r<9; r++) {
            for(int c=0; c<9; c++) {
                char val = board[r][c];
                if(val=='.') {
                    continue;
                }
                if(rows[r].contains(val)) {
                    return false;
                }
                rows[r].add(val);
                if(cols[c].contains(val)) {
                    return false;
                }
                cols[c].add(val);
                int index = ((r/3)*3)+(c/3);
                if(boxes[index].contains(val)) {
                    return false;
                }
                boxes[index].add(val);
            }
        }
        return true;
    }
}
