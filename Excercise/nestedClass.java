class outerClass {
	int groupNum = 5;

	class innerClass {
		void groupMembers() {
			System.out.println("Nasif\tArif\t\tArifa\tSharmin");
		}
	}
}

public class nestedClass {
	public static void main(String[] args) {
		outerClass OC = new outerClass();
		System.out.println("Group Number: " + OC.groupNum);
		outerClass.innerClass IC = OC.new innerClass();
		IC.groupMembers();
	}
}
