public class SimpleProduct extends Product{


    public SimpleProduct(String name, double netoPrice) {
        super(name, netoPrice);
    }

    public double getNetoPrice() {
        return super.getNetoPrice() + (super.getNetoPrice() * 0.21);
    }

    @Override
    public double getNetoPriceInFranks() {
        return super.getNetoPriceInFranks() +(super.getNetoPriceInFranks() * 0.21);
    }

}
