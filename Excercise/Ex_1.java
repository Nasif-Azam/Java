import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter numbers(" + (i + 1) + "): ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num % 2 != 0) {
				sum = sum + num;
			}
		}
		System.out.println("Summation of ODD numbers are: " + sum);
	}

}
