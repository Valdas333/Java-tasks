import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item){
        if ((totalWeight() + item.getWeight()) <= maximumWeight){
        items.add(item);}

    }

    public void printItems(){
        for (Item item:items
             ) {
            System.out.println(item);

        }
    }
    public int totalWeight(){
        int totalItemWeight = 0;
        for (Item item:
                items) {
            totalItemWeight += item.getWeight();
        }
        return totalItemWeight;
    }

    public Item heaviestItem(){
        if (items.size()==0){
            return null;
        }

        int heaviest = 0;
        Item heavesItem = items.get(0);
        for (Item item: items
             ) { if (item.getWeight()>heaviest){
                 heaviest = item.getWeight();
                heavesItem = item;
        }
        }
        return heavesItem;
    }

    @Override
    public String toString(){
        String properEnglish = "items";
        if (items.size() == 0){
            properEnglish = "no items";
        } else if (items.size() == 1) {
            properEnglish = "item";
        }

        return items.size()+ " " + properEnglish +" ("+ totalWeight() +
                " kg)";
    }
}
