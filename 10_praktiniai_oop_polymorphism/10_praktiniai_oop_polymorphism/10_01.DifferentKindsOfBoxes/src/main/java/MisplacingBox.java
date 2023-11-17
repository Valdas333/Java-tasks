import java.util.ArrayList;

public class MisplacingBox extends Box{

    ArrayList<Item> myItems = new ArrayList<>();

    public MisplacingBox(){}
    @Override
    public void add(Item item) {
        myItems.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
