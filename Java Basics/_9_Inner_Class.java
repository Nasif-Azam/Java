
/*	Inner Class 3 type:-
 *  (1) Member Class
 *  (2) Static Class
 *  (3) Anonymous Class
*/
class OuterClass {
	int a = 1;

	public void outer_class() {
		System.out.println("In Outer Class");
	}

	class InnerClass { // OuterClass$InnerClass.class
		int b = 5;

		public void inner_class() {
			System.out.println("In Inner Class");
		}
	}

	static int x = 100;

	static void static_outer_class() {
		System.out.println("In Static Outer Class");
	}

	static class StaticInnerClass {
		int y = 500;

		static void static_inner_class() {
			System.out.println("In Static Inner Class");
		}
	}

}

public class _9_Inner_Class {

	public static void main(String[] args) {
		// Member Class Calling
		OuterClass obj = new OuterClass();
		System.out.println(obj.a);
		obj.outer_class();
		OuterClass.InnerClass obj1 = obj.new InnerClass();
		System.out.println(obj1.b);
		obj1.inner_class();
		// Static Class Calling
		OuterClass.StaticInnerClass sobj = new OuterClass.StaticInnerClass();
		System.out.println(OuterClass.x);
		OuterClass.static_outer_class();
		System.out.println(sobj.y);
		OuterClass.StaticInnerClass.static_inner_class();

	}

}
