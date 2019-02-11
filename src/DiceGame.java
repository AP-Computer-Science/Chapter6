
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        for(long l = 0; l < Long.MAX_VALUE; l++) {
            System.out.println((long)(Math.random() * Long.MAX_VALUE));
        }
        boolean won = false;
        Scanner scan = new Scanner(System.in);
        Set s = new Set(10);
        s.roll();
        System.out.println(s);
        while(!won) {
            System.out.print("Roll [Y/N]? ");
            char input = scan.next().toUpperCase().charAt(0);
            if(input == 'Y') {
                System.out.print("Enter index to roll: ");
                s.roll(scan.nextInt());
            }
            System.out.println(s);
            if(s.IsAllValue(s.getFaceAt(0))) {
                System.out.println("You Won!");
                break;
            }
        }
    }
}