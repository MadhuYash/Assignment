package collectionexamples;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getTotalmarks().compareTo(o2.getTotalmarks()) >0)
		return 1;
		else if(o1.getTotalmarks().compareTo(o2.getTotalmarks()) <0)
		return -1;
		else return 0;
	}

}
