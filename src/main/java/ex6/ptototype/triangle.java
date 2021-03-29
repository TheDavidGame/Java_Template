package ex6.ptototype;

public class triangle extends Shape{

    public int square;

    public triangle() {
    }

    public triangle(triangle target) {
        super(target);
        if (target != null) {
            this.square = target.square;
        }
    }

    @Override
    public Shape clone() {
        return new triangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof triangle) || !super.equals(object2)) return false;
        triangle shape2 = (triangle) object2;
        return shape2.square == square;
    }
}
