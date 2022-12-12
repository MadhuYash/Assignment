package collectionexamples;

import java.util.Comparator;

public class ProductionFacilityComparator2 implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if(o1.getItemnames().length > o2.getItemnames().length)
			return 1;
			else if(o1.getItemnames().length < o2.getItemnames().length)
			return -1;
			else return 0;
	}

}
