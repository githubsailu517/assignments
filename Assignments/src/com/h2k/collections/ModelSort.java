package com.h2k.collections;

import java.util.Comparator;

public class ModelSort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String model1 = ((Car)o1).getModel();
		String model2= ((Car)o2).getModel();
		
		return (model1).compareTo(model2);
	}
		

}
