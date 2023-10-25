import java.util.Scanner;
import java.util.ArrayList;
public class EmployeeExample {
    public static void main(String[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.setFirstName("Eric");
        Employee emp2 = new Employee("Joe","Jones",40,17.50);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(emp);
        employees.add(emp2);
        System.out.println("Here they are printed to the screen: ");
        EmployeeWriter.writeToScreen(employees);
        System.out.print("\nEnter the name of the file to save these to: ");
        String fileName = sc.nextLine();
        if (EmployeeWriter.writeToFile(employees,fileName) == true) {
            System.out.println("Written successfully.");
        } else {
            System.out.println("This was not your lucky day.");
        }
        */
        /* 
        Scanner sc = new Scanner(System.in);
        String fname;
        System.out.print("Enter name of file that contains employee data: ");
        fname = sc.nextLine();
        ArrayList<Employee> readIn = EmployeeReader.readFromFile(fname);
        Employee emp;
        PaycheckPrinter pp = new PaycheckPrinter(0.875);
        if (readIn == null) {
            System.out.println("No employees were read. Something bad happened.");
        } else {
            System.out.println("Here are the employees: ");
            EmployeeWriter.writeToScreen(readIn);
            emp = readIn.get(1);  // get the second employee
            System.out.printf("That employee earned $%.2f.\n",emp.calculateGrossPay());
            System.out.println("Here are the paychecks for everyone.");
            pp.printPaychecks(readIn);
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first, last, hours, and rate: ");
        String first, last;
        double hours, rate;
        first = sc.next();
        last = sc.next();
        hours = sc.nextDouble();
        rate = sc.nextDouble();
        Employee emp = new Employee(first,last,hours,rate);
        emp.addResponsibility("Take out the garbage.");
        emp.addResponsibility("Clean the toilets.");
        System.out.println(emp);
    }
}
