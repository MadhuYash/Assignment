package StringExamplePrograms;

import java.util.LinkedHashMap;

public class StringOccuranceEx {

	public static void main(String[] args) {
		String s = "Yash is is is MNC MNC";
		String[] stringArray = s.split(" ");
		int count = 0;
		LinkedHashMap<String, Integer> mapobj = new LinkedHashMap<>();
		for (int i = 0; i < stringArray.length; i++) {
			String temp = stringArray[i];
			System.out.println(temp+"- at index"+count++);
			if(mapobj.containsKey(temp)) {
				mapobj.put(temp, mapobj.get(temp)+1);
			} else {
				mapobj.put(temp,1);
			}
			
		}
		System.out.println(mapobj);
	}

}
