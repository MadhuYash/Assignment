package StringExamplePrograms;

public class EvenLengthEx {

	public static void main(String[] args) {
		String s = "My name is madhavi";
	
		
		for(String word:s.split(" ")) {
			
			if(word.length()%2==0) {
				System.out.println(word);
			
		}
		
		
			
		}

	}

}
