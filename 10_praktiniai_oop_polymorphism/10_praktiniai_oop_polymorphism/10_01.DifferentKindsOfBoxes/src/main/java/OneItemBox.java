import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> myItems = new ArrayList<>();
    @Override
    public void add(Item item) {
        if (myItems.isEmpty()){
            myItems.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return myItems.contains(item);
    }
}
