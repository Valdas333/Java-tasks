package figures_with_abstract;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
//        super(side, side);
        setWidth(side);
        setLength(side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

//    public Square(double side, String color, boolean filled){
//        setLength(side);
//        setString(color);
//        setFilled(filled);
//    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

//    public double getPerimeter(){
//    with down-casting java takes method from parent Rectangle
//        return 4 * (getSide());
//    }
    @Override
    public String toString() {
        return "A Square with width=" +
                getSide() + ", which is a subclass of " + super.toString();

    }
}
