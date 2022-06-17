package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorea.beans.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext  applicationContext = new ClassPathXmlApplicationContext("beans-config.xml");
		applicationContext.registerShutdownHook();
		Employee bean = applicationContext.getBean("emp22", Employee.class);
		System.out.println(bean);
		// applicationContext.close();
	}
}
