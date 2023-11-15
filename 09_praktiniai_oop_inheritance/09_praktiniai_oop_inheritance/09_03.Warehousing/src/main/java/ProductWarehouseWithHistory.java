public class ProductWarehouseWithHistory extends ProductWarehouse{

    private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, initialBalance);
        this.initialBalance = capacity;

    }

    public String history(){
        return super.toString();
    }
}
