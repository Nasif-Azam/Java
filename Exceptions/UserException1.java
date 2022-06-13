package ExceptionsPractice;

class AgeException extends Exception {
	AgeException(String S) {
		super(S);
	}
}

public class UserException1 {
	public static void main(String[] args) {
		int age = 15;
		try {
			if (age < 18) {
				throw new AgeException("Invalid Age");
			} else {
				System.out.println("Valid Age");
			}
		} catch (AgeException e) {
			System.out.println("Exception is : " + e.getMessage());
		}
	}

}
