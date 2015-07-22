package com.h2k.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;

public class CopyStringArray {

	public static void main(String[] args) {
				
					
		System.out.println("Enter fruit names. Enter \"grows\" to create new array");
		String fruitName;
		String[] fruits = new String[5]  ;
		int index=0;
		Scanner usrTxt= new Scanner(System.in);
		
		do {
			fruitName = usrTxt.nextLine();
			if (!fruitName.equalsIgnoreCase("grows")) {
				fruits[index] = fruitName;
				index++;
			}
			
		} while (!fruitName.equalsIgnoreCase("grows"));

		// declaring new array and copying into it
		String[] fruitsNew = new String[++index];
		int i =0;
		for (String fruit : fruits) {
			if (fruit!=null) {
				fruitsNew[i] = fruit;
				i++;
			}
			
		}
		
		System.out.println("Enter fruit Name to be added:");
		fruitsNew[i] = usrTxt.nextLine();

		
		// Displaying the new copied array
		System.out.println("The fruits in the new copied array are:");
		for (String fruitNew : fruitsNew) {
			if (fruitNew != null) {
				System.out.println(fruitNew);
			}
		}
	}

}
