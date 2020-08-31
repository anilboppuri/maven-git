package com.edureka.training;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {

	public static void main(String[] args) {
		// Collectioins framework in java is to provide services to objects - DS
		// & Algos - Coll & Arrays
		// Collections are containers for Objects
		// Every collection instance is opposite of Array
		ArrayList<String> list = new ArrayList<String>(); // Generic + They grow dynamically
       // type safe collections  - Java Generics
	//	list.add(new Integer("10"));
		list.add(new String("Ola"));
//		list.add(new Object());

		/*Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof Integer) {
				Integer in = (Integer) obj;
				System.out.println(in.intValue());
			} else if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.length());
			}

		}*/

		System.out.println(list);
	}

}
