
public class Program {

    public static void main(String[] args) {
        StorageFacility unit = new StorageFacility();
        unit.add("a111","mouse");
        unit.add("a111","cheese");
        unit.add("a111","cheese");
        unit.add("b123","projector");
        unit.add("g63","ice skates");
        unit.remove("a111","cheese");
        unit.add("a111","cheese");
        unit.contents("a111");
        System.out.println(unit.storageUnits());

          

    }
}
