class Animal {
	String color = "Red";

	public Animal(int num) {
		System.out.println(num + " Animal created");
	}

	void eatRice() {
		System.out.println("Animal eats rice....");
	}
}

class Dog extends Animal {
	String color = "Green";

	public Dog() {
		super(500);
		System.out.println("Dog is created");
	}

	void eatRice() {
		System.out.println("Dog eats rice....");
	}

	void printColor() {
		System.out.println("Dog color is: " + color + " (In child class)");
		System.out.println("Dog color is: " + super.color + " (From parent class)");
		eatRice();
		super.eatRice();
	}
}

public class super_keyword {
	public static void main(String[] args) {
		Dog D = new Dog();
		D.printColor();
	}

}
