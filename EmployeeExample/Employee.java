import java.util.ArrayList;
public class Employee {
    // declare data
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double payRate;
    private ArrayList<String> responsibilities;

    // declare constructors
    public Employee() {
        this("Default","Employee",0,0);
    }
    public Employee(String fn, String ln, double hw, double pr) {
        setFirstName(fn);
        setLastName(ln);
        setHoursWorked(hw);
        setPayRate(pr);
        responsibilities = new ArrayList<String>();
    }
    // declare rest of functions
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0) {
            this.hoursWorked = 0;
        } else {
            this.hoursWorked = hoursWorked;
        }
    }
    public double getPayRate() {
        return payRate;
    }
    public void setPayRate(double payRate) {
        if (payRate < 0) {
            this.payRate = 0;
        } else {
            this.payRate = payRate;
        }
    }
    @Override
    public String toString() {
        return String.format("%s\t%s\t%.2f\t%.2f\t%s", firstName, lastName, hoursWorked, payRate,
            getResponsibilitiesAsString());
    }
    
    public double calculateGrossPay() {
        return hoursWorked * payRate;
    }
    public void addResponsibility(String responsibility) {
        responsibilities.add(responsibility);
    }
    public String getResponsibilitiesAsString() {
        String result = "";
        for (String resp : responsibilities) {
            result = result + resp + "; ";
        }
        return result;
    }
}
