public class WordBank {
    private Word[] words;
    public WordBank(Word[] w) {
        words = w;
    }
    public Word[] getWords() {
        return words;
    }
    public int getLength() {
        return words.length;
    }
}
