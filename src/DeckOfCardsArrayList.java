
import java.util.ArrayList;

public class DeckOfCardsArrayList {
    private ArrayList<Card> _deck;
    private boolean allowJoker = true;
    public DeckOfCardsArrayList() {
        _deck = new ArrayList<Card>();
        for(int i = 1; i <= 13; i++) {
            _deck.add(new Card((int)(Math.random() * 13) + 1, SuitType.Diamonds));
        }
        for(int i = 1; i <= 13; i++) {
            _deck.add(new Card((int)(Math.random() * 13) + 1, SuitType.Clubs));
        }
        for(int i = 1; i <= 13; i++) {
            _deck.add(new Card((int)(Math.random() * 13) + 1, SuitType.Hearts));
        }
        for(int i = 1; i <= 13; i++) {
            _deck.add(new Card((int)(Math.random() * 13) + 1, SuitType.Spades));
        }
    }
    public int deckCount() {
        return _deck.size();
    }
    public Card[] dealHand(int numOfCards) {
        ArrayList<Card> _tempList = new ArrayList<Card>();
        Card[] _tempArray = new Card[numOfCards];
        for(int i = 0; i < numOfCards; i++) {
            int cardVal = (int)(Math.random() * _deck.size() - 1);
            _tempList.add(_deck.get(cardVal));
            _deck.remove(cardVal);
        }
        return _tempList.toArray(_tempArray);
    }
}