package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.config.MyConfi;
import com.te.springcorea.beans.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext  applicationContext = new AnnotationConfigApplicationContext(MyConfi.class);
	
		Employee bean = applicationContext.getBean("employee", Employee.class);
		System.out.println(bean);
		// applicationContext.close();
	}
}
