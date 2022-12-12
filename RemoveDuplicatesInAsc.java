package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInAsc {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 2, 1, 10, 3, 3, 6, 7, 1));
		System.out.println("Arraylist with duplicate elements:" + list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(); //convert the list into set
		set.addAll(list);
		
		list.clear();  // delete all elements in list
		
		list.addAll(set); // add elements from set to list
		
		System.out.println("After removing duplicates: " + list);
		Collections.sort(list); // to sort the elements in Ascending order
		
		System.out.println("after removed duplicates elements in Ascending order: " + list);

	}

}
