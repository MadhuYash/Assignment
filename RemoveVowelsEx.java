package StringExamplePrograms;

public class RemoveVowelsEx {

	public static void main(String[] args) {
		String s1 = "konakanchi";
		String s2 = "Madhavi";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		s3 = s3.replaceAll("[aeiou]", "");
		System.out.println(s3);
		for (int i = 0; i < s3.length(); i++) {
			int count = 0;
			for (int j = 0; j < s3.length(); j++) {
				if (s3.charAt(i) == s3.charAt(j) && i != j) {
					count++;
					break;

				}
			}
			if (count == 0)
				System.out.println(s3.charAt(i));
		}

	}

}
