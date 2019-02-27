import java.util.ArrayList;

public class Crayola {
    public static void main(String[] args) {
        ArrayList<Crayon> box = new ArrayList<Crayon>();
        box.add(new Crayon("Purple"));
        box.add(new Crayon("Green"));
        box.add(new Crayon("Red"));
        box.add(new Crayon("Blue"));
        box.add(0, new Crayon("Brown"));
        box.set(2, new Crayon("Magenta"));
        System.out.println(box);
        System.out.println(box.get(3));
    }
}