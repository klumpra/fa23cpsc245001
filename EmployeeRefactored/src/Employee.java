
import java.util.ArrayList;
public abstract class Employee extends Person implements Payable {
	// just by virtue of extends, I have a first name, last name, and get & set & toSTring
    private double totalEarnings;  // how much they've earned
    private double payRate; 
	private ArrayList<String> responsibilities;
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
	public Employee() {
		this("","",0);
    }
	public Employee(String firstName, String lastName, double payRate) {
		super(firstName,lastName);
        setPayRate(payRate);
        totalEarnings = 0;
		responsibilities = new ArrayList<String>();
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

    @Override
    public String toString() {
    	return String.format("%s\t%s\t%.2f\t%.2f", super.toString(),getResponsibilitiesAsString(),payRate,
        totalEarnings);
    }
    @Override
    public String getType() {
        return "employee";
    }
    public double getTotalEarnings() {
        return totalEarnings;
    }
    public void setTotalEarnings(double totalEarnings) {
        if (totalEarnings < 0) {
            this.totalEarnings = 0;
        } else {
            this.totalEarnings = totalEarnings;
        }
    }
    @Override
    public void getPaid() {
        totalEarnings = totalEarnings + calculatePay();
    }
}
