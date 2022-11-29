package ArrayExamples;

public class NumGreaterThanAverage {

	public static void main(String[] args) {
		int array[] = { 20, 1, 27, 90, 3, 100 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		double average = sum / array.length;
		System.out.println("The average of the array is: " + average);
		System.out.println("The numbers in the array that are greater than the average are: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.println(array[i]);
			}
		}
	}
}
