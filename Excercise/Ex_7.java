import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num2: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Num3: ");
		int num3 = sc.nextInt();

//		if ((num1 >= num2) && (num1 >= num3)) {
//			System.out.println("Largest: " + num1);
//
//		} else if ((num2 >= num1) && (num2 >= num3)) {
//			System.out.println("Largest: " + num2);
//
//		} else {
//			System.out.println("Largest: " + num3);
//
//		}
//
//		if ((num1 <= num2) && (num1 <= num3)) {
//			System.out.println("Smallest: : " + num1);
//		} else if ((num2 <= num1) && (num1 <= num3)) {
//			System.out.println("Smallest: : " + num2);
//		} else {
//			System.out.println("Smallest: : " + num3);
//		}

		int largest = num1 >= ((num2 >= num3) ? num2 : num3) ? num1 : ((num2 >= num3) ? num2 : num3);
		System.out.println("Largest: " + largest);
		int smallest = num1 <= ((num2 <= num3) ? num2 : num3) ? num1 : ((num2 <= num3) ? num2 : num3);
		System.out.println("Largest: " + smallest);

	}

}
