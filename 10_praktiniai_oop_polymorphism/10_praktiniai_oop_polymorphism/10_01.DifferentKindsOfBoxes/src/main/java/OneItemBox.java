import java.util.ArrayList;

public class OneItemBox extends Box{

    private Item myItem;
    private ArrayList<Item> myItems = new ArrayList<>(1);

    @Override
    public void add(Item item) {
        if (myItem == null){
            myItem = item;
        }

//        if (myItems.isEmpty()){
//            myItems.add(item);
//        }
    }

    @Override
    public boolean isInBox(Item item) {
        return item.equals(myItem);

//        return myItems.contains(item);
    }
}
