package leetcode419;

public class CountNumberOfShipFunction {
	// O(1) extra memory without editing X to .
	public int countBattleships(char[][] board) {
        int result = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    continue;
                } else if (j > 0 && board[i][j - 1] == 'X'){
                    continue;
                } else if (i > 0 && board[i - 1][j] == 'X'){
                    continue;
                }
                result++;
            }
        }
        
        return result;
    }
	
	// DFS that change X to . whenever we see a ship
    public int countBattleships1(char[][] board) {
        int result = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'X'){
                    dfs(board, i, j);
                    result++;
                }
            }
        }
        
        return result;
    }
    
    private void dfs(char[][] board, int i, int j){
        if(j >= board[0].length || i >= board.length || board[i][j] == '.'){
            return;
        }
        
        // Mark as visited
        board[i][j] = '.';
        
        // Check only right
        dfs(board, i, j + 1);
        
        // Check only down
        dfs(board, i + 1, j);
    }
}
