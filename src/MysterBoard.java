import java.util.Scanner;

public class MysterBoard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Grid g = new Grid(5, 5);
        g.addShip(new Ship()
                .addPart(0, 0, '[')
                .addPart(0, 1, 'H')
                .addPart(0, 2, 'H')
                .addPart(0, 3, ']'));
        while(true) {
            System.out.println(g.toString());
            System.out.print("Enter coordinate to strike(Ex A1): ");
            char[] input = s.next().toCharArray();
            g.strike(new Coordinate(g.convertCharToNum(input[0]), Integer.parseInt(new String(new char[] {input[1] }))));
        }
    }
}
