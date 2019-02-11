
import java.util.Arrays;

public class Set {
    private Die[] dice;
    public Set(int size) {
        dice = new Die[size];
        for(int i = 0; i < dice.length; i++) {
            dice[i] = new Die();
        }
    }
    public void roll() {
        for(Die d : dice) {
            d.roll();
        }
    }
    public void roll(int index) {
        if(index < dice.length) {
            dice[index].roll();
        }
        else {
            System.out.println("Invalid index.");
        }
    }
    public int getFaceAt(int index) {
        return dice[index].getFace();
    }
    public int getLength() {
        return dice.length;
    }
    public boolean IsAllValue(int value) {
        return Arrays.stream(dice).allMatch(dice -> dice.getFace() == value);
    }
    public String toString() {
        String s = new String();
        Sorts.insertionSort(dice);
        int counter = 1;
        for(Die d : dice) {
            if(counter == 5) {
                s += d.getFace() + "\t\n";
                counter = 1;
            }
            else {
                s += d.getFace() + "\t";
                counter++;
            }
        }
        return s;
    }
}