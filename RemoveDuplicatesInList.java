package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 2, 1, 10, 3, 3, 6, 7, 1));
		System.out.println("Arraylist with duplicate elements:" + list);
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list); //convert the list into set
		
		
		System.out.println("After removing duplicates: " + set);

	}

}
