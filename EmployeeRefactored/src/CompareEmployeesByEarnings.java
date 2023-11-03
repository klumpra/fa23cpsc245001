import java.util.Comparator;

public class CompareEmployeesByEarnings implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        double earnings1 = e1.getTotalEarnings();
        double earnings2 = e2.getTotalEarnings();
        if (earnings1 > earnings2) {
            return -1;
        } else if (earnings1 < earnings2) {
            return 1;
        } else {
            return 0;
        }
    }
}
