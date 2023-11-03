
import java.util.ArrayList;
public class Employee extends Person {
	// just by virtue of extends, I have a first name, last name, and get & set & toSTring
	private double hoursWorked;
	private double payRate;
	private ArrayList<String> responsibilities;
	public Employee() {
		this("","",0,0);
	}
	public Employee(String firstName, String lastName, double hours, double rate) {
		super(firstName,lastName);
		setHoursWorked(hours);
		setPayRate(rate);
		responsibilities = new ArrayList<String>();
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
    public double calculateGrossPay() {
        return hoursWorked * payRate;
    }
    @Override
    public String toString() {
    	return String.format("%s\t%.2f\t%.2f", super.toString(),hoursWorked,payRate);
    }
    @Override
    public String getType() {
        return "employee";
    }
}
