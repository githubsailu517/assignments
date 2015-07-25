package com.h2k.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCompareAndComparator {

	public static  List<Person> list = getPersons();
	public static List<Car> listCar = getCars();
	
	public static void main(String[] args) {
	//	sortCompare();
	//	sortUsingLambdaExpression();
		sortUsingAnonymousInnerClass();
		
	}
	
	public static void sortCompare() {
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(listCar);
		Collections.sort(listCar, new ModelSort());
		System.out.println(listCar);
	}
	
	public static void sortUsingLambdaExpression() {
		System.out.println(list);
		Collections.sort(list, (Object o1, Object o2)-> (((Person)o1).name.compareTo(((Person)o2).name)));		
		System.out.println(list);
	}
	
	public static void sortUsingAnonymousInnerClass() {
		System.out.println(listCar);
		Collections.sort(listCar, new Comparator<Car>() {
			@Override
			public int compare(Car c1, Car c2) {
				return c1.make.compareTo(c2.make);
			}
			
		});
		System.out.println(listCar);
	}
	
	public static List getPersons(){
		List<Person> list = new ArrayList();
		list.add (new Person("Ram", "8976 Durham Lane"));
		list.add(new Person("Abhi", "945 Fountain Cir"));
		list.add (new Person("Laxman", "1787 Orange County"));
		
		return list;		
	}
	
	public static List getCars() {
		List<Car> listCar = new ArrayList();
		listCar.add(new Car("Toyota", "Carolla"));
		listCar.add(new Car("Honda", "Accord"));
		listCar.add(new Car("Benz", "Audi"));
		
		return listCar;		
	}

}
