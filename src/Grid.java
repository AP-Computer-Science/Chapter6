public class Grid {
    private int[][] _grid = null;
    int _col = 0;
    int _row = 0;
    public Grid(int col, int row) {
        _grid = new int[col][row];
        _col = col;
        _row = row;
    }
    public String toString() {
        String s = "";
        for(int r = 0; r < _grid[r].length; r++) {
            for(int c = r; c < _grid[r].length; c++) {
                s += _grid[c][r] + "\n";
            }
        }
        return s;
    }
}