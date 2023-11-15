public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    //private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
       addToWarehouse(initialBalance);

    }

    public String history(){
        return history.toString();
    }

    public void addToWarehouse(double amount){
       super.addToWarehouse(amount);
       double balance = super.getBalance();
       history.add(balance);
    }

    public double takeFromWarehouse(double amount){
        double amountTaken = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return amountTaken;
    }

    public void printAnalysis(){
        System.out.println("Product: " + getName() + "\nHistory: " + this.history +
                "\nLargest amount of product: " + history.maxValue() + "\nSmallest amount of product: " +
                history.minValue() + "\nAverage: " + history.average());
    }
}
