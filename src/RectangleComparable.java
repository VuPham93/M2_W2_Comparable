public class RectangleComparable extends Rectangle
        implements Comparable<RectangleComparable> {

    public RectangleComparable() {
    }

    public RectangleComparable(double width, double length) {
        super(width, length);
    }

    public RectangleComparable(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public int compareTo(RectangleComparable r) {
        if (getPerimeter() > r.getPerimeter()) {
            return 1;
        }
        else if (getPerimeter() < r.getPerimeter()) {
            return -1;
        }
        else
            return 0;
    }
}
