import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

/**
 * The view class for Employee objects. Employee is the model class, and this is the view.
 */
public class EmployeeWriter {
    /**
     * This static function writes each employee to the screen using the Employee class's toString function
     * @param emps the list of Employees
     */
    public static void writeToScreen(ArrayList<Employee> emps) {
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
    /**
     * This function prints employee objects to the named text file
     * @param emps the list of employees
     * @param fname the name of the file
     * @return true if successful and false otherwise
     */
    public static boolean writeToFile(ArrayList<Employee> emps, String fname) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(fname))));
            for (Employee emp : emps) {
                pw.println(emp);
            }
            pw.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
