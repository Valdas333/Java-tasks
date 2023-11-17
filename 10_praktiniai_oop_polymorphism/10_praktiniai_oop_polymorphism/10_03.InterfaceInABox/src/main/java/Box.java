import java.util.ArrayList;

public class Box implements Packable{

    private double maxCapacity;
    private ArrayList<Packable> myBelongings;
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.myBelongings = new ArrayList<>();
    }

    public void add(Packable myItem){
        if (myItem.weight() + weight() <= maxCapacity){
        myBelongings.add(myItem);
        }
    }

    @Override
    public String toString() {
        return "Box: " + myBelongings.size() + " items, total weight " + weight() + " kg";
    }

    @Override
    public double weight() {
        return myBelongings.stream().mapToDouble(Packable::weight).sum();
    }
}
