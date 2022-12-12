package collectionexamples;

import java.util.Comparator;

public class ProductionFacilityComparator implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if(o1.getTotalproduction_perday()>o2.getTotalproduction_perday())
			return 1;
			else if(o1.getTotalproduction_perday()<o2.getTotalproduction_perday())
			return -1;
			else return 0;
	}

}
