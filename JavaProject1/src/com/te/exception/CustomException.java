package com.te.exception;

public class CustomException {
	public static void main(String[] args) throws AgeNotValidException {
		int age = 17;

		try {
			if (age < 18) {
				throw new AgeNotValidException("not eligible bcz you are under 18");
			} else {
				System.out.println("you can vote");
			}
		} catch (AgeNotValidException e) {
			e.printStackTrace();
		}
	}
}
