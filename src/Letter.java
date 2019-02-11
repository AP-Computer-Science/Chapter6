public class Letter {
    private char letter;
    private boolean uncovered;
    public Letter(char l) {
        letter = l;
    }
    public char getLetter() {
        return letter;
    }
    public void uncover() {
        uncovered = true;
    }
    public boolean isUncovered() {
        return uncovered;
    }
}