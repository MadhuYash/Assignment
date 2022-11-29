package StringExamplePrograms;

import java.util.ArrayList;

public class PassArgToMainEx {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0;i<args.length;i++){
			s.add(args[i]);
			
		}
		s.replaceAll(u ->u.replaceAll("[^a-zA-Z]"," "));
		System.out.println(s);
		
		
		
	}

}
