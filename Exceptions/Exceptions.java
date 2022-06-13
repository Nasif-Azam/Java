package ExceptionsPractice;

public class Exceptions {
	public static void main(String[] args) {

		try {
			int data = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Can't divided by Zero " + e);
		}
		try {
			int arr[] = new int[3];
			arr[3] = 15;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
