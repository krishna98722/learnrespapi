package basic;

public class Phone {
private String name;
@Override
public String toString() {
	return "Phone [name=" + name + ", brand=" + brand + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Phone(String name, String brand) {
	super();
	this.name = name;
	this.brand = brand;
}
private String brand;

}
