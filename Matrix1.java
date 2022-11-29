package ArrayExamples;

public class Matrix1 {

	public static void printBoundary(int a[][], int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					System.out.print(a[i][j] + "");
				}
				
				

				else if (i == m - 1) {
					System.out.print(a[i][j] + "");
				}
				

			}

		}

		System.out.println("");
		for (int i = 0; i < m; i++) {
			int j = 0;
			System.out.print(a[i][j]);

		}
		for (int i = 0; i < m; i++) {
			int j = n - 1;
			System.out.print(a[i][j]);

		}

	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		printBoundary(a, 4, 4);
	}
}
