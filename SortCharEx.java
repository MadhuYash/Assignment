package ArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = sc.nextLine();
		char[] array = s.toCharArray();
		for (char c : array) {
			System.out.println(c);
		}
		Arrays.sort(array);
		System.out.println("The sorted char array is:");
		for (char ar : array) {
			System.out.print(ar);
		}
	}

}
