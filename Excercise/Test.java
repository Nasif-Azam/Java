
class A {
	int add(int a, int b) {
		System.out.println("Nasif");
		return a + b;
	}

	float add(float c, float d) {
		return c / d;
	}
}

class B extends A {
	int add(int a, int b) {
		System.out.println("Azam");
		return a * b;
	}
}

public class Test {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("Mul " + obj.add(5, 5));
		System.out.println("Div" + obj.add(25, 5));
	}
}
