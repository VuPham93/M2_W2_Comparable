import java.util.Arrays;

public class RectangleComparableTest {
    public static void main(String[] args) {
        RectangleComparable[] rectangles = new RectangleComparable[3];
        rectangles[0] = new RectangleComparable();
        rectangles[1] = new RectangleComparable(2.3, 5.8);
        rectangles[2] = new RectangleComparable(2.5, 3.8, "orange", true);

        System.out.println("Pre-sorted:");
        for (RectangleComparable rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (RectangleComparable rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
