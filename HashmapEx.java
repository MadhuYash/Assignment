package collectionexamples;

import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;

public class HashmapEx {

	public static void main(String[] args) {

		HashMap<String, Integer> obj = new HashMap<String, Integer>();

		obj.put("Hyderabad", 6800000);
		obj.put("Bangalore", 8000000);
		obj.put("Mumbai", 12000000);
		obj.put("Chennai", 5000000);
		obj.put("Pune", 1000000);

		for(Map.Entry<String, Integer> entry:obj.entrySet()) {
			System.out.println("before sorting-> key: " + entry.getKey() + ", value = " + entry.getValue());
		}
		System.out.println("\n");
		
		TreeMap<String, Integer> obj1  = new TreeMap<String, Integer>(obj);
		for(Map.Entry<String, Integer> entry:obj1.entrySet()) {
			System.out.println("after sorting-> key: " + entry.getKey() + ",value = " + entry.getValue());
		
		
		
		}

	}

}
