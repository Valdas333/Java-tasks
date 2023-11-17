import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Herd implements Movable {

    private ArrayList<Movable> myHerd = new ArrayList<>();

    public void addToHerd(Movable movable) {
        myHerd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        //myHerd.forEach(m -> m.move(dx, dy));
        for (Movable movable : myHerd) {
            movable.move(dx, dy);
        }
    }

    public String toString() {
        return myHerd.stream().map(Movable::toString).collect(Collectors.joining("\n"));

    }
}
