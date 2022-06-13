package Abstraction;
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle......");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle......");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing Square......");
	}
}

public class Abstraction_Shape {
	public static void main(String[] args) {
		Shape S;
		S = new Rectangle();
		S.draw();
		S = new Circle();
		S.draw();
		S = new Square();
		S.draw();

//		Shape Sr = new Rectangle();
//		Sr.draw();
//		Shape Sc = new Circle();
//		Sc.draw();
//		Shape Ss = new Square();
//		Ss.draw();

	}

}
