
public class Customer extends Person {
	private String address;
	private double annualEarnings;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAnnualEarnings() {
		return annualEarnings;
	}
	public void setAnnualEarnings(double annualEarnings) {
		if (annualEarnings < 0) {
			this.annualEarnings = 0;
		} else {
			this.annualEarnings = annualEarnings;
		}
	}
	public Customer() {
		this("","","",0);
	}
	public Customer(String firstName, String lastName, String address, double earnings) {
		super(firstName,lastName);
		setAddress(address);
		setAnnualEarnings(earnings);
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%.2f", super.toString(),address,annualEarnings);
	}
	@Override
	public String getType() {
		return "customer";
	}
}
