package Algorithm;

class Quicksort {

	static int partition(int array[], int low, int high) {
		int pivot = array[low];
		System.out.print("Pivot: " + array[low]);
		int i = low;
		int j = high;
		while (i < j) {
			do {
				i++;
			} while (array[i] <= pivot);
			do {
				j--;
			} while (array[j] > pivot);
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[j];
		array[j] = array[low];
		array[low] = temp;
		return j;
	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			System.out.print(",\tPartition Index Position: " + pi + " \n");

			System.out.print("Left elements: ");
			for (int k = 0; k < pi; k++) {
				System.out.print(array[k] + " ");
			}
			System.out.println();
			System.out.print("Right elements: ");
			for (int z = pi + 1; z < array.length - 1; z++) {
				System.out.print(array[z] + " ");
			}
			System.out.println();

			quickSort(array, low, pi);
			quickSort(array, pi + 1, high);
		}
	}
}

class Lab_8_QuickSort {
	public static void main(String args[]) {

		int[] data = { 20, 7, 15, 9, 35, 4, 1, 11, 7, 16, 99999 };
		int size = data.length;

		Quicksort.quickSort(data, 0, size - 1);

		System.out.print("\nSorted array: ");
		for (int i = 0; i < size - 1; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}