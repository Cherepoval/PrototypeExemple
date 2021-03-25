package shapes;

public class Circle extends Shape {
    public int radius;

    public Circle (){
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {

        if (!(object2 instanceof Circle)) return false;
        if (!super.equals(object2)) return false;

        Circle circle2 = (Circle) object2;

        return radius == circle2.radius;
    }

}
