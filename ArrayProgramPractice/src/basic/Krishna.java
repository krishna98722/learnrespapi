package basic;

public class Krishna implements Comparable<Krishna>{
private Integer id;
private String address;
private int age ;

public Krishna(int id, String address, int age) {
	super();
	this.id = id;
	this.address = address;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Krishna [id=" + id + ", address=" + address + ", age=" + age + "]";
}
@Override
public int compareTo(Krishna o) {
	return this.id-o.id;
}


}
