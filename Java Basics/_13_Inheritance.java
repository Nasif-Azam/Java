class calculator { // Super / Parent class
	public int add(int a, int b) {
		return a + b;
	}
}

class AdvCalculator extends calculator { // Sub class / Child class
	public int sub(int a, int b) {
		return a - b;
	}
}

class VAdvCalculator extends AdvCalculator {
	public int multi(int a, int b) {
		return a * b;
	}
}

public class _13_Inheritance {

	public static void main(String[] args) {
//		calculator c = new calculator();
//		AdvCalculator c = new AdvCalculator();
		VAdvCalculator c = new VAdvCalculator();
		int result1 = c.add(10, 2);
		int result2 = c.sub(10, 2);
		int result3 = c.multi(10, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
