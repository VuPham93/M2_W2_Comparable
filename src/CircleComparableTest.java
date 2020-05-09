import java.util.Arrays;

public class CircleComparableTest {
    public static void main(String[] args) {
        CircleComparable[] circles = new CircleComparable[3];
        circles[0] = new CircleComparable(3.6);
        circles[1] = new CircleComparable();
        circles[2] = new CircleComparable(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (CircleComparable circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (CircleComparable circle : circles) {
            System.out.println(circle);
        }
    }
}
