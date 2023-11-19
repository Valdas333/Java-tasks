public class MedicineProduct extends Product{

    public MedicineProduct(String name, double netoPrice) {
        super(name, netoPrice);
    }

    @Override
    public double getNetoPrice() {
        return super.getNetoPrice() + (super.getNetoPrice() * 0.09);
    }

    @Override
    public double getNetoPriceInFranks() {
        return super.getNetoPriceInFranks() + (super.getNetoPriceInFranks() * 0.09);
    }
}
