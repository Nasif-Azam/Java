package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortFinalExm_211015006 {
	void merge(char[] chars, int left, int mid, int right) {
		int l = mid - left + 1;
		int r = right - mid;

		char leftArray[] = new char[l];
		char rightArray[] = new char[r];

//		System.out.println("Left elements");
		for (int i = 0; i < l; ++i) {
			leftArray[i] = chars[left + i];
//			System.out.println(leftArray[i]);
		}

//		System.out.println("Right ele");
		for (int j = 0; j < r; ++j) {
			rightArray[j] = chars[mid + 1 + j];
//			System.out.println(rightArray[j]);
		}

		int i = 0, j = 0;
		int k = left;
		while (i < l && j < r) { // Copying the smaller element in array

			if (leftArray[i] <= rightArray[j]) {
				chars[k] = (char) leftArray[i];
				i++;
			} else {
				chars[k] = (char) rightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) { // Copying any remainnig left element in array
			chars[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < r) { // Copying any remainnig right element in array
			chars[k] = rightArray[j];
			j++;
			k++;
		}
	}

	void sort(char[] chars, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			System.out.println("Mid position: " + mid + "th index and Mid value: " + chars[mid]);

			System.out.print("Left elements: ");
			for (int i = left; i <= mid; i++) {
				System.out.print(chars[i] + " ");
			}
			System.out.println();
			System.out.print("Right elements: ");
			for (int i = mid + 1; i < chars.length; i++) {
				System.out.print(chars[i] + " ");
			}
			System.out.println();
			sort(chars, left, mid);
			sort(chars, mid + 1, right);
			merge(chars, left, mid, right);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unordered string: ");
		String inString = sc.next();

//		String inString = "badusalubertlkuswvxqu";
		char[] chars = inString.toCharArray();

		MergeSortFinalExm_211015006 MS = new MergeSortFinalExm_211015006();
		MS.sort(chars, 0, chars.length - 1);

		// Printing the output
		System.out.println("Sorted array: " + Arrays.toString(chars));
	}
}
