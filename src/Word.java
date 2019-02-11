public class Word {
    private String originalWord;
    private String hint;
    public Word(String o, String h) {
        originalWord = o;
        hint = h;
    }
    public String getWord() {
        return originalWord;
    }
    public String getHint() {
        return hint;
    }
}