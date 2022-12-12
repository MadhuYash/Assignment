package collectionexamples;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSname().compareTo(o2.getSname()) > 0)
			return 1;

		else if (o1.getSname().compareTo(o2.getSname()) < 0)
			return -1;
		else
			return 0;

	}

}
