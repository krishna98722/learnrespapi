package defaultMethod;

public class Person implements Comparable<Person>{
private int PersonId;
private String name;
private Integer PersonAge;
public Person() {
	super();
}
public Person(int personId, String name, Integer personAge) {
	super();
	PersonId = personId;
	this.name = name;
	PersonAge = personAge;
}
public int getPersonId() {
	return PersonId;
}
public void setPersonId(int personId) {
	PersonId = personId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPersonAge() {
	return PersonAge;
}
public void setPersonAge(Integer personAge) {
	PersonAge = personAge;
}
@Override
public String toString() {
	return "Person [PersonId=" + PersonId + ", name=" + name + ", PersonAge=" + PersonAge + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((PersonAge == null) ? 0 : PersonAge.hashCode());
	result = prime * result + PersonId;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (PersonAge == null) {
		if (other.PersonAge != null)
			return false;
	} else if (!PersonAge.equals(other.PersonAge))
		return false;
	if (PersonId != other.PersonId)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public int compareTo(Person o) {
if(this.PersonAge > o.PersonAge) return 1;
else if(this.PersonAge < o.PersonAge) return -1;
	return 0;
// return this.PersonAge - o.PersonAge;
}

}
