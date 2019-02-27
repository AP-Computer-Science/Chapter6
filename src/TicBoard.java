public class TicBoard {
    private String[][] _board = new String[3][3];
    public TicBoard() {
        for(int fx = 0; fx < _board.length; fx++) {
            for(int fy = 0; fy < _board[0].length; fy++) {
                _board[fx][fy] = "-";
            }
        }
    }
    public void setSpace(int row, int col, String s)  {
        if(row >= _board.length || col >= _board[0].length) {
            System.out.println("Input too large.");
            return;
        }
        if(_board[row][col] != "-") {
            System.out.println("Spot taken.");
            return;
        }
        _board[row][col] = s;
    }
    public boolean hasThree(String s) {
        //Check vertical
        for(int x = 0; x < _board.length; x++) {
            for(int y = 0; y < _board[0].length; y++) {
                if(_board[x][0] == s &&
                        _board[x][1] == s && 
                        _board[x][2] == s) return true;
            }
        }
        //Check horizontal
        for(int x = 0; x < _board.length; x++) {
            for(int y = 0; y < _board[0].length; y++) {
                if(_board[0][y] == s &&
                        _board[1][y] == s && 
                        _board[2][y] == s) return true;
            }
        }
        //Check diagnol
        if(_board[2][2] == s &&
                _board[1][1] == s &&
                _board[0][0] == s) return true;
        else if(_board[2][0] == s &&
                _board[1][1] == s &&
                _board[0][2] == s) return true;
        
        return false;
    }
    public String toString() {
        String s = "";
        for(int fx = 0; fx < _board.length; fx++) {
            for(int fy = 0; fy < _board[0].length; fy++) {
                s += _board[fx][fy] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}
