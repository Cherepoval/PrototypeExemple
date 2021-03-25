package shapes;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle (){
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.height = target.height;
            this.width = target.width;
        }

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {

        if (!(object2 instanceof Rectangle)) return false;
        if (!super.equals(object2)) return false;

        Rectangle rectangle2 = (Rectangle) object2;

        return height == rectangle2.height && width == rectangle2.width;
    }

}
