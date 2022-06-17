package assignment1.classdiagram01;

public class Faculty extends Employee{

	private int rank;

	public Faculty(String personName, int salary, int rank) {
		super(personName, salary);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [rank=" + rank + "]";
	}

	public int getRank() {
		return rank;
	}

	
}
