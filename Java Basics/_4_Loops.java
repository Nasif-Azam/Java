public class _4_Loops {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Nasif ");
		}
		whileCond();
		doWhileCon();
		pattern1();
		pattern2();
		pattern2Char();
		pattern3();
		pattern4();
	}

	static void whileCond() {
		int i = 1;
		while (i <= 5) {
			System.out.print("Zisha ");
			i++;
		}
	}

	static void doWhileCon() {
		int i = 1;
		do {
			System.out.print("Nasif + Zisha ");
			i++;
		} while (i <= 5);
	}

	static void pattern1() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void pattern2Char() {
		for (int i = 65; i <= 71; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}

	static void pattern3() {
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}

	static void pattern4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 1 || i == 4 || j == 1 || j == 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
