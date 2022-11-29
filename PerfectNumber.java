package ArrayExamples;

public class PerfectNumber {

	public static void main(String[] args) {
		    	    int array[] = { 4, 7, 12, 496, 6 };
			 	    int N = array.length;
			    countPerfectNumbers(array, N);
			  }
				 
			  
			  // Function to count perfect numbers from an array whose sum of digits is also perfect
			  static void countPerfectNumbers(int arr[], int N)
			  {
			    for (int i = 0; i < N; ++i) {
			 
			      if (isPerfect(arr[i])) {
			          System.out.print(arr[i] + " ");
					  }
			    }
			  }	 
			  
			// To check if a number is perfect number or not
				  static boolean isPerfect(int N)
				  {
				    int sumOfDivisors = 1;
				    for (int i = 2; i <= N / 2; ++i) {
				 
				      if (N % i == 0) {
				        sumOfDivisors += i;
				      }
				    }
				    if (sumOfDivisors == N) {
				      return true;
				    }
				 
				    else
				      return false;
				  }
			

}


