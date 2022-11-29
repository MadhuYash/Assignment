package StringExamplePrograms;

public class RemoveDigitsCharEx {

	public static void main(String[] args) {
		String s = "Madhu123@#$%&*";
		s= s.replaceAll("[^a-zA-Z]"," ");
		System.out.println(s);
	}

}
