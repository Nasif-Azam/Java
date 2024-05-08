package Algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MergeSort {

	public static void sort(char[] chars, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			System.out.println("Mid position: " + middle + "th index and Mid value: " + chars[middle]);
			System.out.print("Left elements: ");
			for (int i = left; i <= middle; i++) {
				System.out.print(chars[i] + " ");
			}
			System.out.println();
			System.out.print("Right elements: ");
			for (int i = middle + 1; i < chars.length; i++) {
				System.out.print(chars[i] + " ");
			}
			System.out.println();

			sort(chars, left, middle);
			sort(chars, middle + 1, right);
			merge(chars, left, middle, right);
		}
	}

	public static void merge(char[] chars, int left, int middle, int right) {
		Queue<Character> queue1 = new LinkedList<Character>();
		Queue<Character> queue2 = new LinkedList<Character>();

		for (int i = left; i <= middle; i++) {
			queue1.add(chars[i]);
		}

		for (int i = middle + 1; i <= right; i++) {
			queue2.add(chars[i]);
		}

		int i = left;

		while (!queue1.isEmpty() && !queue2.isEmpty()) {
			if (queue1.peek() <= queue2.peek()) {
				chars[i++] = queue1.poll();
			} else {
				chars[i++] = queue2.poll();
			}
		}

		while (!queue1.isEmpty()) {
			chars[i++] = queue1.poll();
		}

		while (!queue2.isEmpty()) {
			chars[i++] = queue2.poll();
		}
	}

	public static void sort(char[] chars) {
		sort(chars, 0, chars.length - 1);
	}

	public static void sort(String string) {
		sort(string.toCharArray());
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the unordered string: ");
//		String string = sc.next();

		String inString = "badusalubertlkuswvxqu";
		char[] chars = inString.toCharArray();

		MergeSort.sort(chars);

		for (int i = 0; i < chars.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(chars[i]);
		}
	}
}
