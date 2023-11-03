
import java.util.ArrayList;
public class PersonApp {
	public static void main(String[] args) {
		SalariedEmployee emp1 = new SalariedEmployee("Ray","Klump",50);
		Customer cus1 = new Customer("Brody","Klump","123 Hollywood Lane",75000);
		HourlyEmployee emp2 = new HourlyEmployee("Brody","Klump",38,25.50);
		emp1.getPaid();
		emp2.getPaid();
//		System.out.println(emp1);
//		System.out.println(cus1);
		ArrayList<Person> peeps = new ArrayList<Person>();
		peeps.add(emp1);
		peeps.add(cus1);
		peeps.add(emp2);
		// PersonWriter writer = new PersonWriter();
		//PersonWriter.printToScreen(peeps);
	}
}
