/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author briajbarn42
 */
public class Coordinate {
    private int _x;
    private int _y;
    private boolean _struck = false;
    public Coordinate(int x, int y) {
        _x = x;
        _y = y;
    }
    public int getX() {
        return _x;
    }
    public int getY() {
        return _y;
    }
    public void struck() {
        _struck = true;
    }
    public boolean isStruck() {
        return _struck;
    }
    public String toString() {
        return _x + ", " + _y;
    }
    public boolean equals(Object obj) {
        Coordinate newObj = (Coordinate)obj;
        if(getX() == newObj.getX() && getY() == newObj.getY()) return true;
        else return false;
    }
}
