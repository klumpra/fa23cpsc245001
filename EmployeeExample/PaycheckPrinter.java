import java.util.ArrayList;
/**
 * Prints a list of paychecks for employees.
 * This is a view class because it displays some aspect of our data.
 */
public class PaycheckPrinter {
    private double taxRate;
    public double getTaxRate() {
        return taxRate;
    }
    public void setTaxRate(double taxRate) {
        if (taxRate < 0) {
            this.taxRate = 0;
        } else {
            this.taxRate = taxRate;
        }
    }
    public PaycheckPrinter() {
        taxRate = 0.1;
    }
    public PaycheckPrinter(double taxRate) {
        setTaxRate(taxRate);
    }
    @Override
    public String toString() {
        return "I am a Paycheck Printer";
    }
    public void printPaychecks(ArrayList<Employee> emps) {
        double gross, taxes, net;
        for (Employee emp : emps) {
            gross = emp.calculateGrossPay();
            taxes = taxRate * gross;
            net = gross - taxes;
            System.out.printf("Pay employee %s %s the amount of $%.2f\n", emp.getFirstName(),
                emp.getLastName(),net);
        }    
    }

}
