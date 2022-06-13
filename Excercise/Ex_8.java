
public class Ex_8 {

	public static void main(String[] args) {
		double nums[] = new double[50];
		double numbers = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = numbers++;
			System.out.print("   " + nums[i]);
		}

	}

}
