public class ShipPart {
    private Coordinate coord;
    public char symbol;
    public ShipPart(Coordinate c, char s) {
        coord = c;
        symbol = s;
    }
    public Coordinate getCoordinate() {
        return coord;
    }
    public char getSymbol() {
        return symbol;
    }
    public String toString() {
        return new String(new char[] {getSymbol()});
    }
}