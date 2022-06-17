package assignment1.classdiagram01;

public class Student extends Person {
private int status;

public Student(String personName, int status) {
	super(personName);
	this.status = status;
}

@Override
public String toString() {
	return "Student [status=" + status + "]";
}

public int getStatus() {
	return status;
}


}
