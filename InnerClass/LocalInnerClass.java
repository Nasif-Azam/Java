package InnerClass;

class Outter {
	private int a = 50;

	void display() {
		class Inner {
			void msg() {
				System.out.println("Data is: " + a);
			}
		}
		Inner IC = new Inner();
		IC.msg();
	}
}

class LocalInnerClass {
	public static void main(String[] args) {
		Outter OC = new Outter();
		OC.display();
	}

}
