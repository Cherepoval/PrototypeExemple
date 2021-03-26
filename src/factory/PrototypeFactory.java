package factory;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<String, Shape> cache = new HashMap<>();

    public PrototypeFactory (){
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 10;
        circle.radius = 30;
        circle.color = "green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 15;
        rectangle.height = 20;
        rectangle.width = 12;
        rectangle.color = "white";

        cache.put("Big green circle", circle);
        cache.put("Medium white rectangle", rectangle);
    }

    public Shape put (String key, Shape shape){
        cache.put(key, shape);
        return shape;
    }

    public Shape get (String key){
        return cache.get(key).clone();
    }
}
