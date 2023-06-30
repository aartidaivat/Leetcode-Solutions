class Solution { 
    public boolean exist(char[][] board, String word) { 
        int rows = board.length;
        int cols = board[0].length;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(board[i][j]==word.charAt(0) && wordSearch(i,j,0,board,word)) {
                    return true;
                }
            } 
        }    
        return false;
    }

    public boolean wordSearch(int i, int j, int index, char[][] board, String word) {
        if(index == word.length()) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='.' || board[i][j]!=word.charAt(index)) {
            return false;
        }
        char temp=board[i][j];
        board[i][j]='.';
        if (wordSearch(i+1,j,index+1,board,word) || 
            wordSearch(i-1,j,index+1,board,word) || 
            wordSearch(i,j+1,index+1,board,word) || 
            wordSearch(i,j-1,index+1,board,word)) {
            return true;
        }
        board[i][j]=temp;
        return false;
    }
}
