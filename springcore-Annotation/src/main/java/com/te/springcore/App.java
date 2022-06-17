package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.config.Myconfig;
import com.te.springcorea.beans.Employee;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AbstractApplicationContext  applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
	
		Employee bean = applicationContext.getBean("employee", Employee.class);
		System.out.println(bean);
	
	}
}
