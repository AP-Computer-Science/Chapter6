import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TicBoard tb = new TicBoard();
        String player = "X";
        while(true) {
            System.out.println(tb);
            System.out.print("Enter coordinate for " + player + " (Ex 00): ");
            char[] input = s.next().toCharArray();
            tb.setSpace(Integer.parseInt(new String(new char[] {input[0]})), Integer.parseInt(new String(new char[] {input[1]})), player);
            if(tb.hasThree(player)) {
                System.out.println(player + " won!");
                break;
            }
            player = (player == "X") ? "Y" : "X";
        }
    }
}