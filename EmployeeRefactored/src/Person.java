
public abstract class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	public Person() {
		firstName = "";
		lastName = "";
	}
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
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
    @Override
    public String toString() {
    	return String.format("%s\t%s\t%s",getType(),firstName,lastName);
    }
    public abstract String getType();
    
    @Override
    public int compareTo(Person other) {  // natural sort order is lastname + firstname
        String myLastFirst = lastName+firstName;
        String otherLastFirst = other.getLastName() + other.getFirstName();
        return myLastFirst.compareTo(otherLastFirst);   // delegation
    } 
}
