package figures_with_abstract;

public class Triangle extends Rectangle {

    private double sidePQ;


    public Triangle(){
    }

    public Triangle(double sidePR, double sideRQ, double sidePQ) {
        // sidePR = width, sideRQ = length
        super(sidePR, sideRQ);
        this.sidePQ = sidePQ;
    }

    public Triangle(String color, boolean filled, double side){
        // Equilateral Triangle
        super(side, side, color, filled);
        this.sidePQ = side;
    }

    public Triangle(String color, boolean filled, double sidePR, double sideRQ, double sidePQ) {
        //Scalene Triangle no equal sides
        super(sidePR, sideRQ,color, filled);
        this.sidePQ = sidePQ;
    }

    public double getSidePQ() {
        return this.sidePQ;
    }



    public void setSidePQ(double sidePQ) {
        this.sidePQ = sidePQ;
    }

    @Override
    public double getPerimeter(){
        return getWidth()+getLength()+sidePQ;
    }

    @Override
    public String toString() {
        return "A Triangle with sides:" +
                "sidePR=" + getWidth() +
                ", sideRQ=" + getLength() +
                ", sidePQ=" + sidePQ + ", color=" + super.getColor() + ", filled=" + super.isFilled() +
                ", which is a subclass of " + super.toString();
    }

}
