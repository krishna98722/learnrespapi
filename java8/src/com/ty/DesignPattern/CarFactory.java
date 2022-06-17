package com.ty.DesignPattern;

public class CarFactory {

	public Car CarObjectFactoryMethod(String carBrand) {
		if (carBrand.equalsIgnoreCase("BMW")) {
			return new Bmw();
		}else if(carBrand.equalsIgnoreCase("Audi"))
				{
			return new Audi();
		}
		return null;
	}
}