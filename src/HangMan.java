
import java.util.Arrays;

public class HangMan {
    private Letter[] wordChars;
    private Word originalWord;
    private int attemptsLeft = 5;
    public HangMan(Word word) {
        wordChars = new Letter[word.getWord().length()];
        for(int i = 0; i < wordChars.length; i++) {
            wordChars[i] = new Letter(word.getWord().toCharArray()[i]);
        }
        originalWord = word;
    }
    public int getAttempts() {
        return attemptsLeft;
    }
    public void setAttempts(int a) {
        attemptsLeft = a;
    }
    public Word getOriginalWord() {
        return originalWord;
    }
    public Letter[] getChars() {
        return wordChars;
    }
    public boolean containsChar(char c) {
        return Arrays.stream(wordChars).anyMatch(x -> x.getLetter() == c);
    }
    public void uncoverAll(char c) {
        Arrays.stream(wordChars)
                .filter(x -> x.getLetter() == c)
                .forEach(x -> x.uncover());
    }
    public boolean allUncovered() {
        return Arrays.stream(wordChars)
                .allMatch(x -> x.isUncovered());
    }
    public boolean alreadyUncovered(char c) {
        return Arrays.stream(wordChars)
                .filter(x -> x.getLetter() == c)
                .anyMatch(x -> x.isUncovered());
    }
}