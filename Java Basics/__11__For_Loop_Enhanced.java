public class __11__For_Loop_Enhanced {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int row : a) {
			System.out.print(row + " ");
		}
		System.out.println("\n");

		int b[][] = { { 1, 2, 3, 4, 5 }, { 5, 4, 3, 2, 1 }, { 6, 7, 8, 9, 0 }, { 0, 9, 8, 7, 6 } };
		for (int row[] : b) {
			for (int colm : row) {
				System.out.print(colm + " ");
			}
			System.out.println();
		}
		for (int row[] : b) {
			System.out.println(row[1] + " ");
		}

	}

}
