package collectionexamples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ProductionFacility2 {

	public static void main(String[] args) {
		
		ArrayList<ProductionFacility> p = new ArrayList<ProductionFacility>();
		
		String[] strArray1 = {"za","zb","zc"};
		String[] strArray2 = {"ya","yb","yc","yd"};
		String[] strArray3 = {"xa","xb","xc"};
		LocalDate today = LocalDate.now();
		
		p.add(new ProductionFacility(1,"z","Hyd",3,strArray1,LocalDate.now()));
		p.add(new ProductionFacility(2,"y","Banglore",4,strArray2,today.minusDays(1)));
		p.add(new ProductionFacility(3,"x","Chennai",3,strArray3,today.minusDays(2)));
		
		Collections.sort(p,new ProductionFacilityComparator());
		
		
		System.out.println(Arrays.toString(p.get(p.size()-1).getItemnames()));
		
		Collections.sort(p,new ProductionFacilityNameComparator());
		
		for(int i =0 ; i< p.size();i++) {
			System.out.println(p.get(i).getPro_facility_name());
		}
		
		Collections.sort(p,new ProductionFacilityComparator2());
		
		System.out.println(p.get(p.size()-1).getPro_facility_name());
		

		Collections.sort(p,new ProductionFacilityComparator3());
		
		System.out.println(p);
		
		
		
	}

}
