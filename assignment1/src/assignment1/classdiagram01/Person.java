package assignment1.classdiagram01;

public class Person {
private String personName;

public Person(String personName) {
	super();
	this.personName = personName;
}

@Override
public String toString() {
	return "Person [personName=" + personName + "]";
}

public String getPersonName() {
	return personName;
}
}
