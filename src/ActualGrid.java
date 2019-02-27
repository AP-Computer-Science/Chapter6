public class ActualGrid {
    private int[][] _board = null;
    private Coordinate designatedCoord = null;
    public ActualGrid(int x, int y, Coordinate d) {
        _board = new int[x][y];
        for(int fx = 0; fx < _board.length; fx++) {
            for(int fy = 0; fy < _board[0].length; fy++) {
                _board[fx][fy] = 1;
            }
        }
        designatedCoord = d;
    }
    public boolean check(Coordinate d) {
        if(d.getX() >= _board.length || d.getY() >= _board[0].length) {
            System.out.println("Input too large.");
            return false;
        }
        boolean result = designatedCoord.equals(d);
        if(!result) {
            _board[d.getX()][d.getY()] = 0;
        }
        return result;
    }
    public String toString() {
        String s = "";
        for(int x = 0; x < _board.length; x++) {
            for(int y = 0; y < _board[0].length; y++) {
                s += _board[x][y] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}