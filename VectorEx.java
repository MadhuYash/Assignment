package collectionexamples;

import java.util.Collections;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		 Vector <String> vec = new Vector <String>();
		 
		 vec.add("glasses");
		 vec.add("smartphone");
		 vec.add("tv");
		 vec.add("fridge");
		 vec.add("watch");
		 System.out.println("The vector elements are: " + vec);
		 
		 Collections.sort(vec);
		 
		 System.out.println("After sorting the elements are : " + vec);
		 
		 

	}

}
