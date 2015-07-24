package com.h2k.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapIterator {
	
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Abhi", "1234 Durham Lane"));
		personList.add(new Person("Ram", "Burlington Ave, 456"));
		personList.add(new Person("Janaki", "342 Orange County"));
		
		Set<Car> carSet = new HashSet<Car>();
		carSet.add(new Car("Toyota", "Corolla"));
		carSet.add(new Car("Honda", "Civic"));
		carSet.add(new Car("Toyota", "Camry"));
		carSet.add(new Car("Honda", "Accord"));
		
		
		Map objectMap = new HashMap();
		objectMap.put("personList", personList);
		objectMap.put("carSet", carSet);
		objectMap.put("person", new Person("Laxman", "43524 Fountain Cir"));
		
		
		Iterator iter = objectMap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry mapEntry = (Map.Entry)iter.next();
			
			System.out.println("\nKey: " + mapEntry.getKey());
			
			Object mapEntryVal = mapEntry.getValue() ;
			
			if (mapEntryVal instanceof Collection){
				Collection colVal = (Collection) mapEntryVal;
				for (Object obj : colVal) {
					System.out.println("Value: "+ obj.toString());
				}
			} else {
				System.out.println("Value: " + mapEntryVal.toString());
			}
		}		
		
	}

}
