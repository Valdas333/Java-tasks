package figures;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square mysqr = new Square(3);
        System.out.println(mysqr);
        System.out.println(mysqr.getSide());
        System.out.println(mysqr.getPerimeter());
        mysqr.setWidth(15);
        System.out.println(mysqr.getSide());
        System.out.println(mysqr.getPerimeter());
        Triangle myTriangle = new Triangle("Brown", false,3);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getSidePQ());
        System.out.println(myTriangle.perimeter());
        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle);
        Triangle emptyTriangle = new Triangle();
        System.out.println(emptyTriangle);

        ArrayList<Shape> myShapeList = new ArrayList<>();
        myShapeList.add(mysqr);
        myShapeList.add(myRectangle);
        myShapeList.add(emptyTriangle);
        myShapeList.add(myTriangle);

        for (Shape i:myShapeList
             ) {System.out.println(i);

        }

        int sumOfArea = 0;
        for (Shape i:myShapeList
        ) {System.out.println(i.getArea());

        }
    }

}
