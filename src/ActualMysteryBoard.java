import java.util.Scanner;

public class ActualMysteryBoard {
    public static void main(String[] args) {
        ActualGrid g = new ActualGrid(5, 5, new Coordinate(3, 3));
        Scanner s = new Scanner(System.in);
        boolean won = false;
        for(int i = 5; i > 0; i--) {
            System.out.println(g);
            System.out.println("You have " + i + " attempts.");
            System.out.print("Enter coordinate to check (Ex 01): ");
            char[] input = s.next().toCharArray();
            boolean result = g.check(new Coordinate(Integer.parseInt(new String(new char[] {input[0]})), Integer.parseInt(new String(new char[] {input[1] }))));
            if(result) {
                System.out.println("You win!!!");
                won = true;
                break;
            }
            else {
                System.out.println("You missed.");
            }
        }
        if(!won) {
            System.out.println("You lost.");
        }
    }
}