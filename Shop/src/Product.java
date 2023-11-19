public class Product {

    private String name;
    private double netoPrice;
    private double frankExchangeRate;

    public Product(String name, double netoPrice) {
        this.name = name;
        this.netoPrice = netoPrice;
        this.frankExchangeRate = 1.04;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNetoPrice() {
        return netoPrice;
    }

    public void setNetoPrice(double netoPrice) {
        this.netoPrice = netoPrice;
    }

    public double getFrankExchangeRate() {
        return frankExchangeRate;
    }

    public void setFrankExchangeRate(double frankExchangeRate) {
        this.frankExchangeRate = frankExchangeRate;
    }

    public double getNetoPriceInFranks(){
        return this.netoPrice * this.frankExchangeRate;
    }

    @Override
    public String toString() {
        return "Product price in euros " + getNetoPrice() + " and in franks is " + getNetoPriceInFranks();
    }
}
