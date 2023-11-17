import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList <Item> myItems = new ArrayList<>();

    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (this.capacity >= item.getWeight()){
            myItems.add(item);
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return myItems.contains(item);
    }
}
