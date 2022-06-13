package ExceptionsPractice;

public class MultipleExcepttion {
	public static void main(String[] args) {
		try {
			int arr[] = new int[5];
			arr[5] = 12 / 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Out of Bound: " + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Disorder: " + e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Always Executed.");
		}
	}
}
