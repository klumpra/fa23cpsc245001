
import java.util.ArrayList;
public class PersonApp {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ray","Klump",40,50);
		Customer cus1 = new Customer("Brody","Klump","123 Hollywood Lane",75000);
//		System.out.println(emp1);
//		System.out.println(cus1);
		ArrayList<Person> peeps = new ArrayList<Person>();
		peeps.add(emp1);
		peeps.add(cus1);
		for (Person p : peeps) {
			System.out.println(p);
		}
	}
}
