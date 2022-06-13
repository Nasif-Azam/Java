package Abstraction;
abstract class prsGroup {
	prsGroup() {
		System.out.println("Pre Group information: ");
	}

	void display() {
		System.out.println("GUB");
	}

	abstract void groupNum();

	abstract void groupMembers();

}

class group5 extends prsGroup {
	void groupNum() {
		System.out.println("Group Number: 5");
	}

	void groupMembers() {
		System.out.println("Nasif\tArif\t\tArifa\tSharmin");

	}
}

public class Abstraction {
	public static void main(String[] args) {
		group5 obj = new group5();
		obj.groupNum();
		obj.groupMembers();

	}

}
