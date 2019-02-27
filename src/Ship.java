
import java.util.ArrayList;

public class Ship {
    private ArrayList<ShipPart> _parts;
    private boolean _isSunk = false;
    public Ship() {
        _parts = new ArrayList<ShipPart>();
    }
    public Ship addPart(ShipPart s) {
        if(!_parts.contains(s)) {
            _parts.add(s);
        }
        return this;
    }
    public Ship addPart(int x, int y, char s) {
        return addPart(new ShipPart(new Coordinate(x, y), s));
    }
    public void strike(Coordinate c) {
        
    }
}