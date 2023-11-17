package figures_with_abstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square mysqr = new Square(3);
        mysqr.setWidth(15);
        Triangle myTriangle = new Triangle(1, 8,3);
        Rectangle myRectangle = new Rectangle(3,9);
        Triangle emptyTriangle = new Triangle(5,8,7);
        ArrayList<Shape> myShapeList = new ArrayList<>();
        emptyTriangle.setLength(20);
        emptyTriangle.setWidth(111);
        myShapeList.add(mysqr);
        myShapeList.add(myRectangle);
        myShapeList.add(emptyTriangle);
        myShapeList.add(myTriangle);

        for (Shape i:myShapeList
             ) {System.out.println(i);

        }

        int sumOfArea = 0;
        for (Shape i:myShapeList
        ) {sumOfArea += i.getArea();
        }
        System.out.println("Sum of all shape area: " + sumOfArea);

        double largestPerimeter = 0;
        // cast to Rectangle, because Shape is abstract
        Rectangle largesPerimeterShape = new Rectangle();
        for (Shape i : myShapeList){
            Rectangle myNewRect = (Rectangle) i;
            if (myNewRect instanceof Rectangle){
                if (myNewRect.getPerimeter() > largestPerimeter){
                    largestPerimeter = myNewRect.getPerimeter();
                    largesPerimeterShape = myNewRect;
                }
            }
        }
        System.out.println("Biggest perimeter: " + largestPerimeter + ", and winner is: ");
        System.out.println(largesPerimeterShape);

        for (Shape shape: myShapeList) {
            if (shape instanceof Square){
                System.out.println("Square sides are: " +((Square) shape).getSide() + " of something length");
            }
        }
    }

}
