public class AlcoholProduct extends SimpleProduct{

    private double exciseTax;
    private double volume;

    public AlcoholProduct(String name, double netoPrice, double contentOfAlcohol, double volume) {
        super(name, netoPrice);
        this.volume = volume;
        if (contentOfAlcohol <= 15){
            this.exciseTax += volume * 0.89; 
        } else {
            this.exciseTax += volume * 1.26;
        }
    }

    @Override
    public double getNetoPrice() {
        return super.getNetoPrice() + this.exciseTax;
    }

    @Override
    public double getNetoPriceInFranks() {
        return super.getNetoPriceInFranks() + this.exciseTax;
    }
}
