import java.util.Scanner;

public class Ex_5_Area {

	public static double Ex_5_getArea(double r) {
		double radius = (r * r);
		return radius;
	}

	public static double Ex_5_getArea(double r, double pie) {
		double x = Ex_5_getArea(r);
		double Area = x * pie;
		return Area;
	}

	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double pie = Math.PI;

		System.out.println("Area of Circle: " + Ex_5_getArea(r, pie));

	}

}
