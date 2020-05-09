public class SquareComparable extends Square
        implements Comparable<SquareComparable> {

    public SquareComparable() {
    }

    public SquareComparable(double side) {
        super(side);
    }

    public SquareComparable(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compareTo(SquareComparable sq) {
        if (getSide() > sq.getSide()) {
            return 1;
        }
        else if (getSide() < sq.getSide()) {
            return -1;
        }
        else return 0;
    }
}
