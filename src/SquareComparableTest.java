import java.util.Arrays;

public class SquareComparableTest {
    public static void main(String[] args) {
        SquareComparable[] squares = new SquareComparable[3];
        squares[0] = new SquareComparable();
        squares[1] = new SquareComparable(8.3);
        squares[2] = new SquareComparable(5.8, "yellow", true);

        System.out.println("Pre-sorted:");
        for (SquareComparable square : squares) {
            System.out.println(square);
        }

        Arrays.sort(squares);

        System.out.println("After-sorted:");
        for (SquareComparable square : squares) {
            System.out.println(square);
        }
    }
}
