public class SalariedEmployee extends Employee {
    @Override
    public double calculatePay() {
        return getPayRate();
    }
    @Override
    public String getType() {
        return "salaried employee";
    }
    public SalariedEmployee() {
        this("","",0);
    }
    public SalariedEmployee(String firstName, String lastName, double payRate) {
        super(firstName,lastName,payRate);
    }
}
