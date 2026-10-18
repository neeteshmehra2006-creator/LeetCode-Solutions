class Solution {
    public boolean isvalid(char[][] board, int row, int col, char ch){
        //for horizontially
        for(int j = 0; j<9; j++){
            if(board[row][j] == ch)return false;
        }
        //for vertically
        for(int i =0; i<9; i++){
            if(board[i][col] == ch)return false;
        }
        //for 3*3grid
        int rgrid = row/3*3;
        int cgrid = col/3*3;
        for(int i =rgrid; i<rgrid+3; i++){
            for(int j =cgrid; j<cgrid+3; j++){
                if(board[i][j] == ch)return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    board[i][j] = '.';
                    if(isvalid(board , i ,j , ch) == false)return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }
}