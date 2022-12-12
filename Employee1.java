package collectionexamples;

import java.util.HashMap;

public class Employee1 {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> obj = new HashMap<Integer, Employee>();
		
		obj.put(1, new Employee(11,"Madhavi",30000,"Dev","Banglore"));
		obj.put(2, new Employee(22,"Supritha",50000,"It","Hyd"));
		obj.put(3, new Employee(33,"Teja",40000,"Qa","Chennai"));
		obj.put(4, new Employee(44,"Priya",60000,"Service","Mumbai"));
		obj.put(5, new Employee(55,"Ramesh",70000,"Analyst","Delhi"));
		

	}

}
