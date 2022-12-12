package collectionexamples;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrderEx {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();
		s.add("Madhu");
		s.add("Teja");
		s.add("Pandu");
		s.add("Rammi");
		s.add("Madhavi");
		Collections.sort(s);

		System.out.println("Elements in ascending order: " + s);

	}

}
