package com.te.filmIndustry;

public class Movie {
	private String name;

	private Director dir = new Director("ambani", "sci-fi"); // early instantiation or composition or tight-coupling

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Director getDir() {
		return dir;
	}

	public Movie() {
		super();
	}

	public Movie(String name) {
		super();
		this.name = name;
	}

	public void setDir(Director dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", dir=" + dir + "]";
	}

}
