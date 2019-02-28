public class Card implements Comparable {
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
        if(value == 1) result += "Ace";
        else if(value == 11) result += "Jack";
        else if(value == 12) result += "Queen";
        else if(value == 13) result += "King";
        else if(value == 14) result += "Joker";
        else result += value;
        SuitType s = getSuit();
        if(s == SuitType.Diamonds) result += " \u2666";
        else if(s == SuitType.Clubs) result += " \u2662";
        else if(s == SuitType.Hearts) result += " \u2661";
        else if(s == SuitType.Spades) result += " \u2664";
        return result;
    }
    //Compute worth based on specified suit.
    //Hearts is trump (4).
    //Diamonds (3)
    //Clubs (2)
    //Spades (1)
    public int compareTo(Object t) {
        Card tCard = (Card)t;
        int value = this.value;
        int tValue = tCard.value;
        int suitWorth;
        if(this.suit == SuitType.Hearts) value += 4; 
        else if(this.suit == SuitType.Diamonds) value += 3;
        else if(this.suit == SuitType.Clubs) value += 2;
        else if(this.suit == SuitType.Spades) value += 1;
        if(tCard.suit == SuitType.Hearts) value += 4; 
        else if(tCard.suit == SuitType.Diamonds) tValue += 3;
        else if(tCard.suit == SuitType.Clubs) tValue += 2;
        else if(tCard.suit == SuitType.Spades) tValue += 1;
        return value - tValue;
    }
}