package StringExamplePrograms;

public class ReverseWord {

	public static void main(String[] args) {
		String s= "My name is Madhu";
		String s1 = "";
		String[] stringArray = s.split(" ");
        for(int i=0;i<stringArray.length;i++) {
        	StringBuffer sb = new StringBuffer(stringArray[i]);
        	sb.reverse();
        	s1+=sb+" ";
        }
        System.out.println(s1);
	}

}
