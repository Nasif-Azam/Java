
public class _3_Conditional {

	public static void main(String[] args) {
		String myName = "Nasif", herName = "Zisha";
		int a = 5, b = 10;
		if (b == 0) {
			System.out.println("Do Nothing");
		} else if (b % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		if (myName == "Nasif") {
			System.out.println("He is NASIF");
		} else {
			System.out.println("She is ZISHA");
		}
		ternary();
		switch_case();

	}

	static void ternary() {
		int num = 12, j;
		j = num > 5 ? 1 : 2;
		System.out.println(j);
	}

	static void switch_case() {
		int point = 60 / 10;
		switch (point) {
		case 1:
		case 2:
		case 3:
		case 4: {
			System.out.println("Grade: F");
			break;
		}
		case 5: {
			System.out.println("Grade: D");
			break;
		}
		case 6: {
			System.out.println("Grade: C");
			break;
		}
		case 7: {
			System.out.println("Grade: B");
			break;
		}
		case 8: {
			System.out.println("Grade: A+");
			break;
		}
		default:
		}
	}
}
