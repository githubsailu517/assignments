package com.h2k.collections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class classObj = Class.forName("com.h2k.collections.Person");
		
		System.out.println(classObj.getClass());
		System.out.println(classObj.getName());
		
		Method[] methods = classObj.getMethods();
		System.out.println("METHODS");
		for (Method method : methods) {
			System.out.println(method.getName());
			if (method.getName().equals("callMe")){
				Person person = (Person) classObj.newInstance();
				Method meth = classObj.getDeclaredMethod("callMe", null);
				meth.invoke(person, null);
				break;
			}
		}
		
		Class[] interfaces= classObj.getInterfaces();
		System.out.println("INTERFACES");
		for (Class interface1 : interfaces) {
			System.out.println(interface1);
		}
		
		

	}

}
