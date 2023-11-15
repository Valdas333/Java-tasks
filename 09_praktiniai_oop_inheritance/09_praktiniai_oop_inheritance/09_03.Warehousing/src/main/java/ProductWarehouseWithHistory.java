public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    //private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
       addToWarehouse(initialBalance);

    }

    public String history(){
        return super.toString();
    }
}
