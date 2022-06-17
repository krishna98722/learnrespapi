package com.te.filmIndustry;

public class FilmCity {

	public static void main(String[] args) {
		Actor actor = new Actor();
		actor.setName("papon");
		actor.setPrice(1000000);
		actor.setM1(actor.shootMovie());
		System.out.println(actor);
	}

}
