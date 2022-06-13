
class casio {
	public casio() {
		int a = 1;
		int b = 1;
		String name = "Nasif_1";
		System.out.println("1st Constructor");
	}

	public casio(int x) {
		int a = x;
		int b = 1;
		String name = "Nasif_1";
		System.out.println("2nd Constructor");
	}

	public casio(int x, int y) {
		int a = x;
		int b = y;
		String name = "Nasif_1";
		System.out.println("3rd Constructor");
	}

	public casio(int x, int y, String S) {
		int a = 1;
		int b = 1;
		String name = S;
		System.out.println("4th Constructor");
	}

	public void add(int a) {
		System.out.println("1st Method: " + a);
	}

	public void add(int a, int b) {
		System.out.println("2nd Method: " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("3rd Method: " + (a + b + c));
	}

	public void add(double a, int b, String c) {
		System.out.println("4th Method: " + (a + b) + c);
	}
}

public class _7_Method_Constructor_Overloading {

	public static void main(String[] args) {
		casio obj = new casio();
		casio obj1 = new casio(100);
		casio obj2 = new casio(100, 200);
		casio obj3 = new casio(100, 200, "NASIF");
		obj.add(5);
		obj.add(5, 5);
		obj.add(5, 5, 5);
		obj.add(5.2, 5, " Nasif");
	}

}
