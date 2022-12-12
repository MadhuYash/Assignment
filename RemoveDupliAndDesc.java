package collectionexamples;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDupliAndDesc {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("perfume");
		s.add("colgate");
		s.add("coffee");
		s.add("kurtis");
		s.add("shirts");
		s.add("kurtis");
		s.add("perfume");

		LinkedHashSet<String> set = new LinkedHashSet<>(); // convert the list into set
		set.addAll(s);

		s.clear(); // delete all elements in list

		s.addAll(set);

		System.out.println("After removing duplicates: " + s);
		Collections.sort(s,Collections.reverseOrder()); // to sort the elements in descending order

		

		System.out.println("Elements in descending order: " + s);

	}

}
