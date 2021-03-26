package app;

import factory.PrototypeFactory;
import shapes.Shape;

public class Application2 {
    public static void main (String[] args){

        PrototypeFactory cache = new PrototypeFactory();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Big green circle");
        Shape shape3 = cache.get("Medium white rectangle");
        Shape shape4 = cache.get("Medium white rectangle");

        if (shape1 != shape2){
            System.out.println("Big green circles are two different objects!");
            if (shape1.equals(shape2)){
                System.out.println("And they are identical!");
            } else {
                System.err.println("But they are not identical.");
            }
        } else {
            System.err.println("Objects are the same.");
        }

        if (shape3 != shape4){
            System.out.println("Medium white rectangles are two different objects!");
            if (shape3.equals(shape4)){
                System.out.println("And they are identical!");
            } else {
                System.err.println("But they are not identical.");
            }
        } else {
            System.err.println("Objects are the same.");
        }
    }
}
