package com.h2k.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public void init(){
		System.out.println("Bean is initialized");
	}

	
	public void destroy() {
		System.out.println("Bean is destroyed");		
	}
	
	

}
