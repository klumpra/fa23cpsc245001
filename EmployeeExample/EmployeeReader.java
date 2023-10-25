import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
/*
 * This is a data access class.
 * It reads employee data from a tab-delimited file.
 * The format matches what EmployeeWriter writes to the file.
 */
public class EmployeeReader {
    public static ArrayList<Employee> readFromFile(String fname) {
        ArrayList<Employee> result = new ArrayList<Employee>();
        try {
            Scanner fsc = new Scanner(new File(fname));
            String line;
            String[] parts;
            String first, last;
            double hours, rate;
            Employee emp;
            while (fsc.hasNextLine()) {
                line = fsc.nextLine().trim();
                if (line.length() == 0) {
                    continue;
                }
                parts = line.split("\t");
                first = parts[0];
                last = parts[1];
                hours = Double.parseDouble(parts[2]);
                rate = Double.parseDouble(parts[3]);
                emp = new Employee(first,last,hours,rate);
                result.add(emp);
            }
            fsc.close();
            return result;
        } catch (Exception ex) {
            return null;
        }
    }
}
