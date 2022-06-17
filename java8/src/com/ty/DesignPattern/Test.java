package com.ty.DesignPattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter car brand name");
		String cartype = sc.next();
		CarFactory carObj = new CarFactory();
   
		Car carOb=carObj.CarObjectFactoryMethod(cartype);
		carOb.carBrand();
		carOb.carMileage();
		carOb.carTopSpeed();
		
	}
}
