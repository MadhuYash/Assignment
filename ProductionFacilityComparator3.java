package collectionexamples;

import java.util.Comparator;

public class ProductionFacilityComparator3 implements Comparator<ProductionFacility> {

	@Override
	public int compare(ProductionFacility o1, ProductionFacility o2) {
		if (o1.getProd_date().compareTo(o2.getProd_date()) > 0)
			return 1;

		else if (o1.getProd_date().compareTo(o2.getProd_date()) < 0)
			return -1;
		else
			return 0;
	}

}
