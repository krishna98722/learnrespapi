package assignment1.classdiagram01;

public class Staff extends Employee{

	private String title;
	
	public Staff(String personName, int salary, String title) {
		super(personName, salary);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}

	public String getTitle() {
		return title;
	}

	
}
