
class A {
	int a;
	float b;
	String f_name;
	String l_name;
	char c;

	public A() { // Default Constructor
		a = 50;
		b = 40.21F;
		System.out.println("Default Constructor: ");
	}

	public A(int k) {
		a = k;
		b = k;
		System.out.println("Constructor Overloading");
	}

	public A(double m, float n) {
		a = (int) m;
		b = n;
		System.out.println("Constructor Overloading_2");
	}

	public A(String first_name, char spc, String last_name) {
		f_name = first_name;
		l_name = last_name;
		c = spc;
		System.out.println("Constructor Overloading_3");
	}
}

public class _6_Constructor {

	public _6_Constructor() {
		System.out.println("NASIF AZAM");
	}

	public static void main(String[] args) {
		_6_Constructor cons = new _6_Constructor();
		A obj = new A("Nasif", ' ', "Azam"); // Constructor
//		System.out.println(obj.a + obj.b);
		System.out.println(obj.f_name + obj.c + obj.l_name);
	}

}
