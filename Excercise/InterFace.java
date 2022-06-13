
interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

public class InterFace implements Showable {
	public void print() {
		System.out.println("Printed");
	}

	public void show() {
		System.out.println("Showed");
	}

	public static void main(String[] args) {
		InterFace IF = new InterFace();
		IF.print();
		IF.show();
	}
}
