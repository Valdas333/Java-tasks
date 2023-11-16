package figures;

public class Triangle extends Shape{

    private double sidePR;
    private double sideRQ;
    private double sidePQ;


    public Triangle(){
    }

    public Triangle(String color, boolean filled, double side){
        // Equilateral Triangle
        super(color, filled);
        this.sidePR = side;
        this.sideRQ = side;
        this.sidePQ = side;
    }

    public Triangle(String color, boolean filled, double sidePR, double sideRQ, double sidePQ) {
        //Scalene Triangle no equal sides
        super(color, filled);
        this.sidePR = sidePR;
        this.sideRQ = sideRQ;
        this.sidePQ = sidePQ;
    }

    public double getSidePR() {
        return this.sidePR;
    }

    public double getSideRQ() {
        return this.sideRQ;
    }

    public double getSidePQ() {
        return this.sidePQ;
    }

    public void setSidePR(double sidePR) {
        this.sidePR = sidePR;
    }

    public void setSideRQ(double sideRQ) {
        this.sideRQ = sideRQ;
    }

    public void setSidePQ(double sidePQ) {
        this.sidePQ = sidePQ;
    }

    public double perimeter(){
        return sidePR+sideRQ+sidePQ;
    }

    @Override
    public String toString() {
        return "A Triangle with sides" +
                "sidePR=" + sidePR +
                ", sideRQ=" + sideRQ +
                ", sidePQ=" + sidePQ + ", color=" + super.getColor() + ", filled=" + super.isFilled() +
                ", which is a subclass of " + super.toString();
    }

}
