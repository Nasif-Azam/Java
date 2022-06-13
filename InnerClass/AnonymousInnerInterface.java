package InnerClass;

interface persons {
	void eat();
}

public class AnonymousInnerInterface {

	public static void main(String[] args) {
		persons P = new persons() {
			public void eat() {
				System.out.println("Eating...");

			}
		};
	}

}
