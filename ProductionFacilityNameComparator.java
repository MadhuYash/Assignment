package collectionexamples;

import java.util.Comparator;

public class ProductionFacilityNameComparator implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		
		if (o1.getPro_facility_name().compareTo(o2.getPro_facility_name()) > 0)
			return 1;

		else if (o1.getPro_facility_name().compareTo(o2.getPro_facility_name()) < 0)
			return -1;
		else
			return 0;
	}

}
