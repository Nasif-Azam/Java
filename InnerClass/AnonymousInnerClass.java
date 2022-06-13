package InnerClass;

abstract class person {
	abstract void eat();
}

class AnonymousInnerClass {

	public static void main(String[] args) {
		person P = new person() {
			void eat() {
				System.out.println("Eating...");

			}
		};
	}

}
