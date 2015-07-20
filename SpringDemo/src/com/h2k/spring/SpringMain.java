package com.h2k.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("This is my new message");
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
		
		

	}

}
