import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		int sumofOdd = 0, sumofEven = 0;
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter numbers(" + (i + 1) + "): ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num % 2 == 0) {
				sumofEven = sumofEven + num;
			} else {
				sumofOdd = sumofOdd + num;
			}
		}
		System.out.println("Summation of Even numbers are: " + sumofEven);
		System.out.println("Summation of Odd numbers are: " + sumofOdd);
		System.out.println("Difference between (Odd - Even): " + (sumofOdd - sumofEven));

	}

}
