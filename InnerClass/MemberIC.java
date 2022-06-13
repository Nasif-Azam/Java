package InnerClass;

class OutterClass {
	class InnerClass {
		void msg() {
			System.out.println("Nasif");
		}
	}
}

public class MemberIC {
	public static void main(String[] args) {
		OutterClass OC = new OutterClass();
		OutterClass.InnerClass IC = OC.new InnerClass();
		IC.msg();
	}
}
