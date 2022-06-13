package PolymorphismPrac;

//Static Polymorphism
class Adder {
	Adder() { // Constructor Overloading
		System.out.println("Nothing Added!!");
	}

	Adder(int a, int b) { // Constructor Overloading
		System.out.println("Add 2 num: " + (a + b));
	}

	void DoubleAdder(double a) {// Method Overloading
		System.out.println("Add 1 double num: " + (a + a));
	}

	void DoubleAdder(double a, double b) {// Method Overloading
		System.out.println("Add 2 double num: " + (a + b));
	}
}

//Dynamic Polymorphism
class multiplication extends Adder { // Method Overriding
	void DoubleAdder(double a, double b) {
		System.out.println("Multiplication of 2 double num: " + (a * b));
	}
}

public class Calculator {
	public static void main(String[] args) {
		Adder obj;
		obj = new Adder(5, 10);
		obj.DoubleAdder(.5);
		obj.DoubleAdder(10.5, 0.3);

		multiplication Mul = new multiplication();
		Mul.DoubleAdder(5.2, 5.3);
	}
}
