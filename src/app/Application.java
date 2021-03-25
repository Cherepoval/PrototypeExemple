package app;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main (String[] args){

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 30;
        rectangle.height = 15;
        rectangle.color = "blue";
        shapes.add(rectangle);

        shapeClone (shapes , shapesCopy);
    }

    private static void shapeClone (List<Shape> shapes, List<Shape> shapesCopy){
        for (Shape shape: shapes){
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++){
            if (shapes.get(i) != shapesCopy.get(i)){
                System.out.println( i + ": Shapes are different objects");

                if (shapes.get(i).equals(shapesCopy.get(i))){
                    System.out.println("And they are identical");
                } else {
                    System.out.println("But they aren't identical ");
                }
            } else {
                System.out.println( i + ": Shapes are the same objects");
            }
        }
    }

}
