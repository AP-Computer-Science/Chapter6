public class CardGame {
    public static void main(String[] args) {
        DeckOfCardsArrayList _card = new DeckOfCardsArrayList();
        System.out.println("Deck count " + _card.deckCount());
        Card[] hand = _card.dealHand(12);
        Sorts.insertionSort(hand);
        for(Card c : hand) {
            System.out.print(c + " ");
        }
        System.out.println("\nDeck count " + _card.deckCount());
    }
}