
import java.util.ArrayList;
import java.util.Collections;
public class PersonApp {
	public static void main(String[] args) {
		SalariedEmployee emp1 = new SalariedEmployee("Ray","Klump",50);
		Customer cus1 = new Customer("Brody","Klump","123 Hollywood Lane",75000);
		HourlyEmployee emp2 = new HourlyEmployee("Karen","Klump",38,25.50);
		emp1.getPaid();
		emp2.getPaid();
//		System.out.println(emp1);
//		System.out.println(cus1);
		ArrayList<Person> peeps = new ArrayList<Person>();
		peeps.add(emp1);
		peeps.add(cus1);
		peeps.add(emp2);
		System.out.println("Before sort");
		PersonWriter.printToScreen(peeps);
		Collections.sort(peeps);
		System.out.println("After sort");
		PersonWriter.printToScreen(peeps);
		// PersonWriter writer = new PersonWriter();
		//PersonWriter.printToScreen(peeps);
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		System.out.println("Here are just the employees sorted by their earnings: ");
		Collections.sort(emps,new CompareEmployeesByEarnings());
		for (Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
