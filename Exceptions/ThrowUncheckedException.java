package ExceptionsPractice;

public class ThrowUncheckedException {

	static void ageValid(int age) {
		if (age < 18) {
			throw new ArithmeticException("Not Eligible for vote..");
		} else {
			System.out.println("Eligible for vote..");
		}
	}

	public static void main(String[] args) {
		ageValid(13);
	}

}
