public class VineProduct extends AlcoholProduct{

    private double exciseTax;

    public VineProduct(String name, double netoPrice, double contentOfAlcohol, double volume) {
        super(name, netoPrice, contentOfAlcohol, volume);
        if (contentOfAlcohol <= 8.5){
            this.exciseTax += volume * 0.28;
        } else {
            this.exciseTax += volume * 0.72;
        }
    }

}
