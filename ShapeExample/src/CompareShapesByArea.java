import java.util.Comparator;
public class CompareShapesByArea implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        double area1 = s1.calculateArea();
        double area2 = s2.calculateArea();
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }
}
