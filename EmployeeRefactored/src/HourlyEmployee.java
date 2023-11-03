public class HourlyEmployee extends Employee {
	private double hoursWorked; 
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
    public HourlyEmployee() {
        this("","",0,0);
    }
    public HourlyEmployee(String firstName, String lastName, double payRate, double hoursWorked) {
        super(firstName,lastName,payRate);
        setHoursWorked(hoursWorked);
    }
    @Override
    public double calculatePay() {
        return hoursWorked * getPayRate();
    }
    @Override
    public String getType() {
        return "hourly employee";
    }
    @Override
    public String toString() {
        return String.format("%s\t%.2f",super.toString(),hoursWorked);
    }
}
