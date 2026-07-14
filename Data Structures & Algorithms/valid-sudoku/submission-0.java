class Solution {
    public boolean valid(int row,int col,char ch,char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            if(i!=col && board[row][i]==ch)return false;
            if(i!=row && board[i][col]==ch)return false;
            if(((3*(row/3)+i/3)!=row || (3*(col/3)+i%3)!=col) && board[3*(row/3)+i/3][3*(col/3)+i%3]==ch)return false;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!valid(i,j,board[i][j],board))return false;
                }
            }
        }
        return true;
    }
}
