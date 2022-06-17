package com.te.filmIndustry;

public class Actor {

	private String name;
	private double price;
	private Movie m1;

	@Override
	public String toString() {
		return "Actor [name=" + name + ", price=" + price + ", m1=" + m1 + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Movie getM1() {
		return m1;
	}

	public void setM1(Movie m1) {
		this.m1 = m1;
	}

	public Actor(String name, double price, Movie m1) {
		super();
		this.name = name;
		this.price = price;
		this.m1 = m1;
	}

	public Actor() {
		super();
	}

	// helper method
	public Movie shootMovie() {
		return new Movie("hero no 1");
	}
}
