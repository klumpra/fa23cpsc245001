import java.util.Comparator;
public class CompareShapesByPerim implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        double perim1 = s1.calculatePerimeter();
        double perim2 = s2.calculatePerimeter();
        if (perim1 < perim2) {
            return -1;
        } else if (perim1 == perim2) {
            return 0;
        } else {
            return 1;
        }
    }
}
