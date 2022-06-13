package PolymorphismPrac;

class animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends animal {
	void Dname() {
		System.out.println("Dog");
	}
}

class Cat extends animal {
	void Cname() {
		System.out.println("Cat");
	}
}

class Main {
	public static void main(String[] args) {
		Dog D = new Dog();
		D.Dname();
		D.eat();

		Cat C = new Cat();
		C.Cname();
		C.eat();
	}

}
