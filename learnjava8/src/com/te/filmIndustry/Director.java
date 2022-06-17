package com.te.filmIndustry;

public class Director {
	private String name;
	private String gener;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGener() {
		return gener;
	}

	public Director() {
		super();
	}

	public Director(String name, String gener) {
		super();
		this.name = name;
		this.gener = gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", gener=" + gener + "]";
	}

}
