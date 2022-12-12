package collectionexamples;

import java.util.ArrayList;
import java.util.Collections;

public class Student2 {

	public static void main(String[] args) {

		ArrayList<Student> slist = new ArrayList<Student>();

		slist.add(new Student(1, "Madhavi", "10thclass", "490"));
		slist.add(new Student(2, "Supritha", "10thclass", "410"));
		slist.add(new Student(3, "Teja", "10thclass", "480"));
		slist.add(new Student(4, "Pandu", "10thclass", "400"));
		slist.add(new Student(5, "Mani", "10thclass", "200"));
		slist.add(new Student(6, "Priya", "10thclass", "50"));
		Collections.sort(slist, new StudentMarksComparator());
		int n = slist.size();
		// 1.
		for (int i = 1; i < 4 ; i++) {
			System.out.println(slist.get(n - i));
		}
		// 2.
		for (int i = 0; i < n; i++) {
			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (500 * 50 / 100)) {
				System.out.println(slist.get(i) + "Below 50%");
			}
		}
		// 3.
		for (int i = 0; i < n; i++) {
			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (500 * 35 / 100)) {
				System.out.println(slist.get(i) + "Below 35%");

			}
		}
		int average = 0;
		// 4.
		for (int i = 0; i < n; i++) {

			average = average + Integer.parseInt(slist.get(i).getTotalmarks());

		}
		System.out.println(average/5);
		for (int i = 0; i < n; i++) {

			if ((Integer.parseInt(slist.get(i).getTotalmarks())) < (average / 5)) {
				System.out.println(slist.get(i) + "Below Average Marks");

			}
		}
		System.out.println("______________________-");
		//5.
		Collections.sort(slist,new StudentNameComparator());
		System.out.println(slist);
	}

}
