
import java.util.ArrayList;

public class Grid {
    private ShipPart[][] _grid = null;
    int desX = 0;
    int desY = 0;
    private ArrayList<Ship> _ships;
    private int _shipCount = 0;
    public Grid(int x, int y) {
        _grid = new ShipPart[x][y];
        _ships = new ArrayList<Ship>();
        for(int fx = 0; fx < _grid.length; fx++) {
            for(int fy = 0; fy < _grid[0].length; fy++) {
                _grid[fx][fy] = new ShipPart(new Coordinate(x, y), 'X');
            }
        }
    }
    public void addShip(Ship _ship) {
        _ships.add(_ship);
        _shipCount++;
    }
    public char convertNumToLetter(int num) {
        //A = 65
        //B = 90
        return (char)(65 + num);
    }
    public int convertCharToNum(char letter) {
        return letter - 65;
    }
    public void strike(Coordinate c) {
        
    }
    public String toString() {
        String s = "\t";
        for(int y2 = 0; y2 < _grid[0].length; y2++)
        {
            s += y2 + "\t";
        }
        s += "\n\t=================================\n";
        for(int x = 0; x < _grid.length; x++) {
            s += convertNumToLetter(x) + ": \t";
            for(int y = 0; y < _grid[0].length; y++) {
                s += _grid[x][y] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}