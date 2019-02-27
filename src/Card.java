public class Card {
    private int value;
    private SuitType suit;
    public Card(int v, SuitType s) {
        value = v;
        suit = s;
    }
    public int getValue() {
        return value;
    }
    public SuitType getSuit() {
        return suit;
    }
    @Override
    public String toString() {
        String result = "";
        result += value;
        SuitType s = getSuit();
        if(s == SuitType.Diamonds) {
            result += " \u2666";
        }
        return result;
    }
}
