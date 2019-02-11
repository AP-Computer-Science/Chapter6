
import java.util.Scanner;

public class HangManDriver {
    static WordBank[] wordBanks =
    {
        //Normal Words
        new WordBank(new Word[]
        {
            new Word("lemon", "Something sour"),
            new Word("daisy", "It looks pretty."),
            new Word("lava", "Youch!!! It's hots!!"),
            new Word("alleviate", "The pain is gone.")
        }),
        //Fun Words!
        new WordBank(new Word[]
        {
            new Word("bumfuzzle", "The trinity is three seperate beings yet one... Get it?"),
            new Word("snickersnee", "Don't touch that! It's sharp."),
            new Word("lollygag", "90% of middle schoolers.")
        }),
        //Some phobias you might have
        new WordBank(new Word[]
        {
            new Word("hippopotomonstrosesquippedaliophobia", "Do you like long words?"),
            new Word("aerophobia", "Some people think the sky is not so friendly."),
            new Word("americophobia", "Not so patriotic"),
            new Word("pogonophobia", "Stay away from old people!"),
            new Word("bromidrosiphobia", "Teenagers and puberty"),
            new Word("taphephobia", "I hope not the same fate.")
        })
    };
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HangMan!!!!!");
        System.out.println("Generating your word!!!");
        HangMan game = new HangMan(generateRandomWord());
        fillBlank(game.getChars());
        while(true) {
            System.out.println("You have " + game.getAttempts() + " attempts.");
            System.out.print("Enter letter to guess: ");
            char input = scan.next()
                    .trim()
                    .toLowerCase()
                    .charAt(0);
            if(game.alreadyUncovered(input)) {
                System.out.println("Already uncovered.");
                continue;
            }
            if(game.containsChar(input)) {
                game.uncoverAll(input);
            }
            else {
                System.out.println("Incorrect guess.");
                System.out.println("Hint: " + "\"" + game.getOriginalWord().getHint() + "\"");
                game.setAttempts(game.getAttempts() - 1);
                if(game.getAttempts() == 1) {
                    System.out.println("You only have one attempt left.");
                }
            }
            if(game.getAttempts() == 0) {
                System.out.println("You Lost!!!");
                System.out.println("The word was " + game.getOriginalWord());
                break;
            }
            if(game.allUncovered()) {
                fillBlank(game.getChars());
                System.out.println("You won!!!!!");
                break;
            }
            else {
                fillBlank(game.getChars());
            }
        }
    }
    private static Word generateRandomWord() {
        WordBank selectedBank = wordBanks[(int)(Math.random() * wordBanks.length)];
        return selectedBank.getWords()[(int)(Math.random() * selectedBank.getLength())];
    }
    private static void fillBlank(Letter[] word) {
        for(int i = 0; i < word.length; i++) {
            if(word[i].isUncovered()) {
                System.out.print(word[i].getLetter());
                System.out.print(" ");
                continue;
            }
            if(Character.isWhitespace(word[i].getLetter())) {
                System.out.print(" ");
            }
            else {
                System.out.print("_");
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
