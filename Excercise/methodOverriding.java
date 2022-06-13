class addOperation {
	int a = 5, b = 5;

	void operation() {
		System.out.println("Sum: " + (a + b));
	}
}

class multOperation extends addOperation {
	void operation() {
		System.out.println("Multiplication: " + (a * b));
	}
}

public class methodOverriding {
	public static void main(String[] args) {
		multOperation MO = new multOperation();
		MO.operation();

	}

}
